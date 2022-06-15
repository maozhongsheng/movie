package com.reptile.ad.service.impl;

import com.reptile.ad.mapper.MovelTvdataMapper;
import com.reptile.ad.mapper.MovelTvnumsMapper;
import com.reptile.ad.service.XiangKanService;
import com.reptile.ad.utils.MD5Util;
import com.reptile.ad.vo.MovelTvdata;
import com.reptile.ad.vo.MovelTvnums;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author mzs
 * @version 1.0
 * @date 2021/3/8 13:22
 */
@Slf4j
@Service
@Repository
public class XiangKanServiceImpl implements XiangKanService {

    private static final String Iurl = "https://xiangkanzy.net";

    public final static Map<String, String> map = new HashMap() {{
        put("31", "电视剧");
        put("29", "电影");
        put("39", "综艺");
      //  put("44", "动漫");
    }};

    @Autowired
    private MovelTvdataMapper movelTvdataMapper;

    @Autowired
    private MovelTvnumsMapper movelTvnumsMapper;

    @Override
    public void getXiangKanData() throws IOException, ParseException {

        for(Map.Entry<String, String> entry: map.entrySet()) {
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
             String url = Iurl + "/index.php/vod/type/id/" + mapKey + ".html";
             //获取此网站返回的html
             Document siteDoc = Jsoup.connect(url).timeout(5000000).get();
             Integer page = Integer.valueOf(siteDoc.getElementsByTag("div").get(17).getElementsByTag("a").get(8).attr("href").split("\\.")[1].split("\\/")[6]);
             for (int j = 1; j <= page; j++) {//循环获取从第一页开始
                 String url2 = Iurl + "/index.php/vod/type/id/" + mapKey + "/page/" + j + ".html";
                 Document siteDoc2 = Jsoup.connect(url2).timeout(5000000).get();
                 Elements movieName = siteDoc2.getElementsByTag("div").get(13).getElementsByTag("ul");
                 //第一行是标题行不取 最后一行是页码不取
                 for (int k = 1; k < movieName.size()-1; k++) {
                     try {
                         String[] text = movieName.get(k).text().split(" ");
                         String siteurl = movieName.get(k).getElementsByTag("a").get(0).attr("href");//影视地址
                         String name = text[0]; //影视名称
                         String movel_status = text[1]; //影视状态
                         String type = text[2]; //影视分类
                         String updatetime = text[3] + " " + text[4];//修改时间
                         String url3 = Iurl + siteurl;
                         Document siteDoc3 = Jsoup.connect(url3).timeout(5000000).get();
                         String image = siteDoc3.getElementsByTag("div").get(17).getElementsByTag("img").get(0).attr("src");//封面
                         String pingfen = siteDoc3.getElementsByTag("div").get(19).getElementsByTag("label").get(0).text();//评分
                         String alias = siteDoc3.getElementsByTag("div").get(20).getElementsByTag("li").get(0).getElementsByTag("span").get(0).text();//别名
                         String director = siteDoc3.getElementsByTag("div").get(20).getElementsByTag("li").get(1).getElementsByTag("span").get(0).text();//导演
                         String mainstar = siteDoc3.getElementsByTag("div").get(20).getElementsByTag("li").get(2).getElementsByTag("span").get(0).text();//主演
                         String area = siteDoc3.getElementsByTag("div").get(20).getElementsByTag("li").get(4).getElementsByTag("span").get(0).text();//地区
                         String yuyan = siteDoc3.getElementsByTag("div").get(20).getElementsByTag("li").get(5).getElementsByTag("span").get(0).text();//语言
                         String year = siteDoc3.getElementsByTag("div").get(20).getElementsByTag("li").get(6).getElementsByTag("span").get(0).text();//上映
                         String introduction = siteDoc3.getElementsByTag("div").get(25).text();//简介
                         //插入数据库
                         MovelTvdata movelTvdata = new MovelTvdata();
                         String uuid = MD5Util.getMD5(url3 + System.currentTimeMillis());
                         movelTvdata.setUuid(uuid);
                         movelTvdata.setName(name);
                         movelTvdata.setAlias(alias);
                         movelTvdata.setMainstar(mainstar);
                         movelTvdata.setDirector(director);
                         if("电影".equals(mapValue)){
                             movelTvdata.setType(del_type(type));
                         }else{
                             movelTvdata.setType(type);
                         }
                         movelTvdata.setArea(area);
                         movelTvdata.setYear(year);
                         movelTvdata.setIntroduction(introduction);
                         movelTvdata.setPlot(introduction);
                         movelTvdata.setImage(image);
                         movelTvdata.setSitename(Iurl);
                         movelTvdata.setTvtype(mapValue);
                         movelTvdata.setSiteurl(url3);
                         movelTvdata.setUpdatetime(new Date());
                         movelTvdata.setMovel_status(movel_status);
                         int i1 = movelTvdataMapper.insertSelective(movelTvdata);
                         if (1 == i1) {
                             System.out.println("插入数据:视频名称：" + name);
                         }
                         Elements li = siteDoc3.getElementsByTag("div").get(29).getElementsByTag("ul").get(1).getElementsByTag("li");
                         for (int l = 0; l < li.size(); l++) {
                             String num = li.get(l).text().split("\\$")[0];//集数
                             String playurl = li.get(l).text().split("\\$")[1];//地址
                             MovelTvnums movelTvnums = new MovelTvnums();
                             String uuid2 = MD5Util.getMD5(playurl + System.currentTimeMillis());
                             movelTvnums.setUuid(uuid2);
                             movelTvnums.setNum(num);
                             movelTvnums.setTvname(name);
                             movelTvnums.setPlayurl(playurl);
                             movelTvnums.setUpdatetime(new Date());
                             movelTvnums.setTvuuid_id(uuid);
                             int i2 = movelTvnumsMapper.insertSelective(movelTvnums);
                             if (1 == i2) {
                                 System.out.println("插入数据:视频名称：" + name + "影片地址:" + playurl + "页码：" + j);
                             }
                         }
                     } catch (Exception e){
                         e.printStackTrace();
                     }
                 }
             }
        }
    }


    //每天更新视频片源
   // @Override
    public void getDadatuDataDay() throws IOException, ParseException {
        log.info("======collectApplicationMetricTask.start======");
        int movenum = 0;
        for(Map.Entry<String, String> entry: map.entrySet()) {
            try {
                String mapKey = entry.getKey();
                String mapValue = entry.getValue();
                String url = "https://img.ylzy1.com/" + "/index.php/vod/type/id/" + mapKey + ".html";
                //获取此网站返回的html
                Document siteDoc = Jsoup.connect(url).timeout(5000000).get();
                Integer page = Integer.valueOf(siteDoc.getElementsByTag("div").get(20).getElementsByTag("li").get(7).text());//获取页码
                for (int j = 1; j <= page; j++) {//循环获取从第一页开始
                    String url2 = "https://img.ylzy1.com/" + "/index.php/vod/type/id/" + mapKey + "/page/" + j + ".html";
                    Document siteDoc2 = Jsoup.connect(url2).timeout(5000000).get();
                    Elements movieName = siteDoc2.getElementsByTag("div").get(18).getElementsByTag("li");
                    log.info("视频类型：" + mapValue + "-----当前更新页码:" + j);
                    for (int k = 0; k < movieName.size(); k++) {
                        movenum++;
                        String name = movieName.get(k).getElementsByTag("a").get(0).text().replace(" ", ",").trim().split(",")[0];//电影名称
                        //查询影片
                        String mUuid = movelTvdataMapper.selectMovelName(name);
                        String siteurl = movieName.get(k).getElementsByTag("a").get(1).attr("href");//影片地址
                        //电影处理方法如果没有进行新增
                        if ("电影".equals(mapValue)) {
                            if (StringUtils.isEmpty(mUuid)) {
                                addYuleData(siteurl, name, mapValue, j);
                            }
                            //电视剧-动漫-综艺
                        } else {
                            //如果没有两表同时新增
                            if (StringUtils.isEmpty(mUuid)) {
                                addYuleData(siteurl, name, mapValue, j);
                                //存在更新影片集数
                            } else {
                                updateYuleData(siteurl, name, mUuid, j, mapValue);
                            }
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        log.info("已扫描影视数量:"+movenum);
    }

    public String deal_area (String param){
        String resutl = "其他";
        if(param.contains("中国") || param.contains("大陆") || param.contains("国产") || param.contains("国漫") || param.contains("内地")){
            resutl = "中国";
        } else if (param.contains("美")) {
            resutl = "美国";
        } else if (param.contains("韩")) {
            resutl = "韩国";
        } else if (param.contains("日本")) {
            resutl = "日本";
        } else if (param.contains("港")) {
            resutl = "香港";
        }else if (param.contains("印度")) {
            resutl = "印度";
        }else if (param.contains("泰")) {
            resutl = "泰国";
        }else if (param.contains("台")) {
            resutl = "台湾";
        }else if (param.contains("俄罗斯")) {
            resutl = "俄罗斯";
        }
        return resutl;
    }

    public String del_type (String param){
        String resutl = "其他";
        if(param.contains("喜") || param.contains("笑")){
            resutl = "喜剧";
        } else if (param.contains("恐怖") || param.contains("惊")) {
            resutl = "惊悚";
        } else if (param.contains("动作") || param.contains("格斗") || param.contains("热血")) {
            resutl = "动作";
        } else if (param.contains("科幻") || param.contains("幻")) {
            resutl = "科幻";
        } else if (param.contains("剧")) {
            resutl = "剧情";
        } else if (param.contains("爱")) {
            resutl = "爱情";
        }else if (param.contains("武侠")) {
            resutl = "武侠";
        }else if (param.contains("历")) {
            resutl = "历史";
        }else if (param.contains("家庭")) {
            resutl = "家庭";
        }else if (param.contains("罪")) {
            resutl = "犯罪";
        }else if (param.contains("战争")) {
            resutl = "战争";
        }else if (param.contains("灾难")) {
            resutl = "灾难";
        }else if (param.contains("动画")) {
            resutl = "动画";
        }else if (param.contains("冒险")) {
            resutl = "冒险";
        }else if (param.contains("历史")) {
            resutl = "历史";
        }
        return resutl;
    }

    public String deal_zongyi_type (String param){
        String resutl = "其他";
        if("喜".contains(param) || "笑".contains(param)){
            resutl = "搞笑";
        } else if ("秀".contains(param)) {
            resutl = "选秀";
        } else if ("爱".contains(param) || "言情".contains(param) || "偶像".contains(param) || "情感".contains(param)) {
            resutl = "爱情";
        } else if ("音".contains(param) || "文".contains(param) || "声".contains(param) || "情感".contains(param) || "曲艺".contains(param)) {
            resutl = "文艺";
        }
        return resutl;
    }

    public int addYuleData (String siteurl, String name, String mapValue, int page) throws IOException, ParseException {

        String url3 = "https://img.ylzy1.com" + siteurl;
        Document siteDoc3 = Jsoup.connect(url3).timeout(5000000).get();
        String movel_status = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(0).text();//状态
        String alias = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(1).text();//别名
        String type = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(2).text();//类型
        String director = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(3).text();//导演
        String mainstar = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(4).text();//演员
        String area = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(5).text();//地区
        String year = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(7).text();//上映
        String updatetime = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(10).text();//更新时间
        String introduction = siteDoc3.getElementsByTag("div").get(25).text();//简介
        String image = siteDoc3.getElementsByTag("div").get(21).getElementsByTag("img").attr("src");//封面
        //插入数据库
        MovelTvdata movelTvdata = new MovelTvdata();
        String uuid = MD5Util.getMD5(url3+System.currentTimeMillis());
        movelTvdata.setUuid(uuid);
        movelTvdata.setName(name);
        if (2 > alias.split("：").length) {
            alias = "";
        } else {
            alias = alias.split("：")[1];
        }
        movelTvdata.setAlias(alias);
        if (2 > mainstar.split("：").length) {
            mainstar = "";
        } else {
            mainstar = mainstar.split("：")[1];
        }
        movelTvdata.setMainstar(mainstar);
        if (2 > director.split("：").length) {
            director = "";
        } else {
            director = director.split("：")[1];
        }
        movelTvdata.setDirector(director);
        if (2 > type.split("：").length) {
            type = "";
        } else {
            type = type.split("：")[1];
        }
        movelTvdata.setType(type);
        if (2 > area.split("：").length) {
            area = "";
        } else {
            area = area.split("：")[1];
        }
        movelTvdata.setArea(area);
        if (2 > year.split("：").length) {
            year = "";
        } else {
            year = year.split("：")[1];
        }
        movelTvdata.setYear(year);
        movelTvdata.setIntroduction(introduction);
        movelTvdata.setPlot(introduction);
        movelTvdata.setImage(image);
        movelTvdata.setSitename(Iurl);
        movelTvdata.setTvtype(mapValue);
        movelTvdata.setSiteurl(url3);
        movelTvdata.setUpdatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(updatetime.split("：")[1]));
        if (2 > movel_status.split("：").length) {
            movel_status = "";
        } else {
            movel_status = movel_status.split("：")[1];
        }
        movelTvdata.setMovel_status(movel_status);
        int i1 = movelTvdataMapper.insertSelective(movelTvdata);
        if (1 == i1) {
            log.info("插入数据:视频名称：" + name);
        }
        Elements li = siteDoc3.getElementsByTag("div").get(32).getElementsByTag("ul").get(0).getElementsByTag("li");
        for (int l = 0; l < li.size(); l++) {
            try {
                String num = li.get(l).getElementsByTag("a").get(0).getElementsByTag("font").text().split("\\$")[0];//集数
                String playurl = li.get(l).getElementsByTag("a").get(0).getElementsByTag("font").text().split("\\$")[1];//地址
                MovelTvnums movelTvnums = new MovelTvnums();
                String uuid2 = MD5Util.getMD5(playurl + System.currentTimeMillis());
                movelTvnums.setUuid(uuid2);
                movelTvnums.setNum(num);
                movelTvnums.setTvname(name);
                movelTvnums.setPlayurl(playurl);
                movelTvnums.setUpdatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(updatetime.split("：")[1]));
                movelTvnums.setTvuuid_id(uuid);
                int i2 = movelTvnumsMapper.insertSelective(movelTvnums);
                if (1 == i2) {
                    log.info("插入数据:视频名称：" + name + "影片地址:" + playurl + "页码：" + page);
                }
            }catch (Exception e){
                e.printStackTrace();
                continue;
            }
        }
        return i1;
    }

    public int updateYuleData (String siteurl, String name, String uuid, int page, String mapValue) throws IOException, ParseException {
        int i2 = 0;
        String url3 = "https://img.ylzy1.com" + siteurl;
        Document siteDoc3 = Jsoup.connect(url3).timeout(5000000).get();
        String updatetime = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(10).text();//更新时间
        //判断上映时间电视剧综艺如果是在2022年之前不用更新
        if("电视剧".equals(mapValue) || "综艺".equals(mapValue)){
            String year = siteDoc3.getElementsByTag("div").get(22).getElementsByTag("p").get(7).text();//上映
            if (2 > year.split("：").length) {
                year = "";
            } else {
                year = year.split("：")[1];
            }
            if(!"2022".equals(year)){
                log.info("被过滤的影视名称："+name+"---上映时间："+year);
                return 0;
            }
        }
        Elements li = siteDoc3.getElementsByTag("div").get(32).getElementsByTag("ul").get(0).getElementsByTag("li");
        //获取数据库中存在集数
        Integer total = movelTvnumsMapper.selectTotal(uuid);
        //获取网页更新数据
        Integer size = li.size();
        for (int l = total; l <= size-1; l++) {
            try {
                String num = li.get(l).getElementsByTag("a").get(0).getElementsByTag("font").text().split("\\$")[0];//集数
                String playurl = li.get(l).getElementsByTag("a").get(0).getElementsByTag("font").text().split("\\$")[1];//地址
                MovelTvnums movelTvnums = new MovelTvnums();
                String uuid2 = MD5Util.getMD5(playurl + System.currentTimeMillis());
                movelTvnums.setUuid(uuid2);
                movelTvnums.setNum(num);
                movelTvnums.setTvname(name);
                movelTvnums.setPlayurl(playurl);
                movelTvnums.setUpdatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(updatetime.split("：")[1]));
                movelTvnums.setTvuuid_id(uuid);
                i2 = movelTvnumsMapper.insertSelective(movelTvnums);
                if (1 == i2) {
                    log.info("插入数据:视频名称：" + name + "影片地址:" + playurl + "页码：" + page);
                }
            } catch (Exception e){
            e.printStackTrace();
            continue;
             }
        }
        return i2;
    }
}
