package com.reptile.ad.service.impl;


import com.reptile.ad.mapper.MovelTvdataMapper;
import com.reptile.ad.service.DadatuService;
import com.reptile.ad.utils.MD5Util;
import com.reptile.ad.vo.MovelTvdata;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.IOException;
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
public class DadatuServiceImpl implements DadatuService {

    private static final String Iurl = "https://www.asp400.com";

    public final static Map<String, String> map = new HashMap() {{
        put("zy", "综艺");
        put("dm", "动漫");
        put("dy", "电影");
        put("dsj", "电视剧");
    }};

    @Autowired
    private MovelTvdataMapper movelTvdataMapper;

    @Override
    public void getDadatuData() throws IOException {
        //获取地址
        for(Map.Entry<String, String> entry: map.entrySet()) {
            String mapKey = entry.getKey();
            String mapValue = entry.getValue();
            for (int i = 1; i < 2; i++) {
                String url = Iurl + "/dadatu_type/" + mapKey + "-" + i + ".html";
                //获取此网站返回的html
                Document document = Jsoup.connect(url).timeout(5000).get();
                if(null != document){
                    Elements ul = document.getElementsByTag("ul");
                    Elements li = ul.get(8).getElementsByTag("li");
                    for (int j = 0; j < li.size(); j++) {
                        String href = li.get(j).getElementsByTag("div").get(4).getElementsByTag("a").get(0).attr("href");
                        String name = li.get(j).getElementsByTag("div").get(4).getElementsByTag("a").get(0).attr("title");
                        String mainstar = li.get(j).getElementsByTag("div").get(4).getElementsByTag("p").get(0).text();
                        System.out.println("视频地址"+ Iurl + href + ",视频名称:" + name + ":主演人:" + mainstar);
                        //获取详情
                        String siteurl = "https://www.asp400.com/" + href;
                        Document siteDoc = Jsoup.connect(siteurl).timeout(5000).get();
                        Elements directors = siteDoc.getElementsByTag("div").get(17).getElementsByTag("p").get(1).getElementsByTag("span").get(1).getElementsByTag("a");//导演
                        StringBuffer director = new StringBuffer();//主演
                        for (int k = 0; k < directors.size(); k++) {
                            if (k < directors.size() - 1) {
                                director.append(directors.get(k).text()+",");
                            } else {
                                director.append(directors.get(k).text());
                            }
                        }
                        String area = deal_area(siteDoc.getElementsByTag("div").get(17).getElementsByTag("p").get(1).getElementsByTag("i").get(4).getElementsByTag("span").text());//类型
                        String year = deal_year(siteDoc.getElementsByTag("div").get(17).getElementsByTag("p").get(1).getElementsByTag("i").get(3).getElementsByTag("span").text());//年份
                        String introduction = siteDoc.getElementById("content").text();//介绍
                        String type = "";
                        if("zy".equals(mapKey)){
                            type = "综艺";
                        }else {
                            type = deal_zongyi_type(siteDoc.getElementsByTag("div").get(17).getElementsByTag("p").get(1).getElementsByTag("span").get(0).getElementsByTag("a").text());//类型
                            if("其他".equals(type)){
                                type = del_type(siteDoc.getElementsByTag("div").get(17).getElementsByTag("p").get(1).getElementsByTag("span").get(0).getElementsByTag("a").text());
                            }
                        }
                        String image = siteDoc.getElementsByTag("div").get(16).getElementsByTag("img").get(0).attr("src");//图片
                        String sitename = Iurl;
                        String uuid1 = MD5Util.getMD5(siteurl);
                        String tvtype = mapValue;
                        //插入tvdata表数据
                        MovelTvdata movelTvdata = new MovelTvdata();
                        movelTvdata.setUuid(uuid1);
                        movelTvdata.setName(name);
                        movelTvdata.setMainstar(mainstar);
                        movelTvdata.setDirector(director.toString());
                        movelTvdata.setType(type);
                        movelTvdata.setArea(area);
                        movelTvdata.setYear(year);
                        movelTvdata.setIntroduction(introduction);
                        movelTvdata.setImage(image);
                        movelTvdata.setSitename(sitename);
                        movelTvdata.setTvtype(tvtype);
                        movelTvdata.setSiteurl(siteurl);
                        movelTvdataMapper.insertSelective(movelTvdata);
                        //插入tvnums表数据




                    }
                }else{
                    System.out.println(url+"无数据");
                }
            }
        }

    }

    public String startRequests(String siteUrl) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 网址
        HttpGet request = new HttpGet(siteUrl);
        //设置请求头
        request.setHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.54 Safari/537.36");
        //返回数据
        String html = "";
        try {
            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                html = EntityUtils.toString(httpEntity, "utf-8");
//                Document doc = Jsoup.parse(html);
//                Elements table = doc.body().getele("fc");
                //   html.
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
                System.out.println("返回状态不是200");
                System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
        return html;
    }
    public String deal_area (String param){
        String resutl = "其他";
        if("中国".contains(param) || "大陆".contains(param) || "国产".contains(param) || "国漫".contains(param) || "内地".contains(param)){
            resutl = "中国";
        } else if ("美".contains(param)) {
            resutl = "中国";
        } else if ("韩".contains(param)) {
            resutl = "韩国";
        } else if ("日本".contains(param)) {
            resutl = "日本";
        } else if ("港".contains(param)) {
            resutl = "香港";
        }
        return resutl;
    }

    public String del_type (String param){
        String resutl = "其他";
        if("喜".contains(param) || "笑".contains(param)){
            resutl = "搞笑";
        } else if ("恐怖".contains(param) || "惊".contains(param)) {
            resutl = "惊悚";
        } else if ("动作".contains(param) || "武侠".contains(param) || "格斗".contains(param) || "热血".contains(param)) {
            resutl = "动作";
        } else if ("科幻".contains(param) || "奇幻".contains(param) || "神魔".contains(param) || "魔幻".contains(param) || "魔法".contains(param)) {
            resutl = "魔幻";
        } else if ("剧情".contains(param) || "纪录".contains(param) || "犯罪".contains(param) || "悬疑".contains(param) || "伦理".contains(param) || "罪案".contains(param) || "记录".contains(param)) {
            resutl = "剧情";
        } else if ("爱".contains(param) || "言情".contains(param) || "偶像".contains(param)) {
            resutl = "爱情";
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
    public String deal_year (String param){
        String resutl = "其他";
        if("2022".contains(param)){
            resutl = "2022";
        } else if ("2021".contains(param)) {
            resutl = "2021";
        } else if ("2020".contains(param)) {
            resutl = "2020";
        } else if ("2019".contains(param)) {
            resutl = "2019";
        } else if ("2018".contains(param)) {
            resutl = "2018";
        } else if ("2023".contains(param)) {
            resutl = "2023";
        }
        return resutl;
    }
}