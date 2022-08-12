package com.reptile.ad.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.reptile.ad.mapper.MovelTvdataMapper;
import com.reptile.ad.mapper.MovelTvnumsMapper;
import com.reptile.ad.mapper.RotationChartMapper;
import com.reptile.ad.service.MovieService;
import com.reptile.ad.vo.MovelTvdata;
import com.reptile.ad.vo.MovelTvdataExample;
import com.reptile.ad.vo.request.MovieGetClassRequest;
import com.reptile.ad.vo.request.MovieSearchRequest;
import com.reptile.ad.vo.request.MovieTopTypeRequest;
import com.reptile.ad.vo.response.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2022/5/20 18:21
 */


@Slf4j
@Service
@Repository
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovelTvdataMapper movelTvdataMapper;

    @Autowired
    private MovelTvnumsMapper movelTvnumsMapper;

    @Autowired
    private RotationChartMapper rotationChartMapper;

    @Override
    public List<MovieSearchResponseDTO> search(MovieSearchRequest movieSearchRequest) {

        MovelTvdataExample example = new MovelTvdataExample();
        MovelTvdataExample.Criteria criteria = example.createCriteria();
        String type = movieSearchRequest.getType();
        String key_word = movieSearchRequest.getKey_word();
        if("1".equals(type) && StringUtils.isNotEmpty(key_word)){
            criteria.andNameLike(key_word+"%");
        }
        if("2".equals(type) && StringUtils.isNotEmpty(key_word)){
            criteria.andMainstarLike("%"+key_word+"%");
        }
        criteria.andSitenameEqualTo("https://img.ylzy1.com/");
        List<MovelTvdata> movelTvdata = movelTvdataMapper.selectByExampleWithBLOBs(example);
        List<MovieSearchResponseDTO> list = new ArrayList();
        int n = 0;
        if(10 < movelTvdata.size()){
            n = 10;
        }else{
            n = movelTvdata.size();
        }
        for (int i = 0; i < n; i++) {
            MovieSearchResponseDTO movieSearchResponseDTO = new MovieSearchResponseDTO();
            movieSearchResponseDTO.setId(movelTvdata.get(i).getId());
            movieSearchResponseDTO.setUuid(movelTvdata.get(i).getUuid());
            movieSearchResponseDTO.setParam(movelTvdata.get(i).getParam());
            movieSearchResponseDTO.setName(movelTvdata.get(i).getName());
            movieSearchResponseDTO.setDirector(movelTvdata.get(i).getDirector());
            movieSearchResponseDTO.setMainstar(movelTvdata.get(i).getMainstar());
            movieSearchResponseDTO.setImage(movelTvdata.get(i).getImage());
            movieSearchResponseDTO.setTvtype(movelTvdata.get(i).getTvtype());
            movieSearchResponseDTO.setType(movelTvdata.get(i).getType());
            movieSearchResponseDTO.setArea(movelTvdata.get(i).getArea());
            movieSearchResponseDTO.setYear(movelTvdata.get(i).getYear());
            movieSearchResponseDTO.setIntroduction(movelTvdata.get(i).getIntroduction());
            String uuid = movelTvdata.get(i).getUuid();
            List<MovieNum> listNum = movelTvnumsMapper.selectNum(uuid);
            movieSearchResponseDTO.setUrls(listNum);
            list.add(movieSearchResponseDTO);
        }
        return list;
    }

    @Override
    public List<MovieGetClassResponseDTO> getRotationImg() {
        return movelTvdataMapper.selectTopRotation();
    }

    @Override
    public List<Map> getRotationAnnoce() {
        return rotationChartMapper.selectAll();
    }

    @Override
    public List<MovieTopTypeResponseDTO> getTopType(MovieTopTypeRequest movieTopTypeRequest) {
        MovelTvdataExample example = new MovelTvdataExample();
        MovelTvdataExample.Criteria criteria = example.createCriteria();
        String type = movieTopTypeRequest.getType();
        if(StringUtils.isEmpty(type)){
            type = "电视剧";
        }
        criteria.andTvtypeEqualTo(type);
        criteria.andSitenameEqualTo("https://img.ylzy1.com/");
        example.setOrderByClause("uuid ASC");
        PageHelper.startPage(movieTopTypeRequest.getPage(),movieTopTypeRequest.getLimit());
        List<MovelTvdata> movelTvdata = movelTvdataMapper.selectByExampleWithBLOBs(example);
        PageInfo<MovelTvdata> pageInfo = new PageInfo<>(movelTvdata);
        List<MovieTopTypeResponseDTO> list = movelTvdata.stream().map(msg ->{
            MovieTopTypeResponseDTO event = new MovieTopTypeResponseDTO();
            event.setId(msg.getId());
            event.setName(msg.getName());
            event.setMainstar(msg.getMainstar());
            event.setDirector(msg.getDirector());
            event.setType(msg.getType());
            event.setArea(msg.getArea());
            event.setYear(msg.getYear());
            event.setIntroduction(msg.getIntroduction());
            event.setPlot(msg.getPlot());
            event.setImage(msg.getImage());
            event.setParam(msg.getParam());
            event.setSitename(msg.getSitename());
            event.setTvtype(msg.getTvtype());
            event.setSiteurl(msg.getSiteurl());
            return event;
        }).collect(Collectors.toList());
        return list;
    }

    @Override
    public List<Map> getShow() {
        List<Map> result = new ArrayList();
        List<String> list = Arrays.asList("最新热门","电影","电视剧","动漫","综艺");
        for (int i = 0; i < list.size(); i++) {
            Map resultMap = new HashMap();
            if("最新热门".equals(list.get(i))){
                List<MovieShowResponseDTO> resultlist = movelTvdataMapper.selectDataAll();
                resultMap.put("item", resultlist);
                resultMap.put("title", list.get(i));
            }else {
                List<MovieShowResponseDTO> resultlist = movelTvdataMapper.selectDataByTvType("热门"+list.get(i)+"m147-");
                resultMap.put("item", resultlist);
                resultMap.put("title", list.get(i));
            }
            result.add(resultMap);
        }
        return result;
    }

    @Override
    public List<Map> topTypeName() {
        List<Map> result =  movelTvdataMapper.topTypeName();
        return result;
    }

    @Override
    public List<Map> getMovieUrl(MovieTopTypeRequest movieTopTypeRequest) {
        List<Map> result = movelTvnumsMapper.getMovieUrl(movieTopTypeRequest.getV_id());
        return result;
    }

    @Override
    public List<Map> getMovieNums(MovieTopTypeRequest movieTopTypeRequest) {
        List<Map> result = movelTvnumsMapper.getMovieNums(movieTopTypeRequest.getM_id());
        return result;
    }

    @Override
    public List<Map> getSourceNums(MovieTopTypeRequest movieTopTypeRequest) {
        //获取不同片源
        List<Map> r = movelTvdataMapper.selectMovelNums(movieTopTypeRequest.getM_id());
        //循环
        List<Map> result = new ArrayList();
        for (int i = 0; i < r.size(); i++) {
            List<Map> movs = new ArrayList();
            Map res1 = new HashMap();
            //根据uuid查询
            List<Map> uuid = movelTvnumsMapper.getMovieNums(r.get(i).get("uuid").toString());
            for (int j = 0; j < uuid.size(); j++) {
                Map data = new HashMap();
                data.put("uuid",uuid.get(j).get("uuid").toString());
                data.put("tvname",uuid.get(j).get("tvname").toString());
                data.put("num",uuid.get(j).get("num").toString());
                data.put("total",movelTvnumsMapper.selectTotal(r.get(i).get("uuid").toString()));
                data.put("playurl",uuid.get(j).get("playurl").toString());
                movs.add(data);
            }
            res1.put("title","片源"+(i+1));
            res1.put("data",movs);
            result.add(res1);
            
        }
        return result;
    }

    @Override
    public void deleteSensitiveMovie() {
        //获取不合规影视集合
        List<String> result = movelTvdataMapper.getSensitiveMovie();
        if(0 == result.size()){
            log.info("无不合规影视");
            return;
        }
        log.info("共有"+result.size()+"部影视不合规");
        //删除子列表数据
        Integer res = movelTvdataMapper.deleteSensitiveMovieTvNum(result);
        //删除主列表数据
        Integer res2 = movelTvdataMapper.deleteSensitiveMovie(result);
        if(0 < res && 0 < res2){
            log.info("删除不合规视频成功");
        }
    }

    @Override
    public List<Map> getMovieHotSearch() {
        List<Map> result = movelTvdataMapper.getMovieHotSearch();
        return result;
    }

    @Override
    public Map getAb() {
        Map result = new HashMap();
        result.put("a",true);
        return result;
    }

    @Override
    public List<MovieGetClassResponseDTO> getMovieClass(MovieGetClassRequest movieGetClassRequest) {

        MovelTvdataExample example = new MovelTvdataExample();
        MovelTvdataExample.Criteria criteria = example.createCriteria();
        if(!"全部".equals(movieGetClassRequest.getArea())){
            criteria.andAreaEqualTo(movieGetClassRequest.getArea());
        }
        if(!"全部".equals(movieGetClassRequest.getType())){
            criteria.andTypeEqualTo(movieGetClassRequest.getType());
        }
        if(StringUtils.isNotEmpty(movieGetClassRequest.getTvtype())){
            criteria.andTvtypeEqualTo(movieGetClassRequest.getTvtype());
        }
        if(!"全部".equals(movieGetClassRequest.getYear())){
            criteria.andYearEqualTo(movieGetClassRequest.getYear());
        }
        criteria.andSitenameEqualTo("https://img.ylzy1.com/");
        example.setOrderByClause("uuid ASC");
        PageHelper.startPage(movieGetClassRequest.getPage(),movieGetClassRequest.getLimit());
        List<MovelTvdata> movelTvdata = movelTvdataMapper.selectByExampleWithBLOBs(example);
        PageInfo<MovelTvdata> pageInfo = new PageInfo<>(movelTvdata);
        List<MovieGetClassResponseDTO> list = movelTvdata.stream().map(msg ->{
            MovieGetClassResponseDTO event = new MovieGetClassResponseDTO();
            event.setId(msg.getId());
            event.setUuid(msg.getUuid());
            event.setName(msg.getName());
            event.setMainstar(msg.getMainstar());
            event.setDirector(msg.getDirector());
            event.setType(msg.getType());
            event.setArea(msg.getArea());
            event.setYear(msg.getYear());
            event.setIntroduction(msg.getIntroduction());
            event.setPlot(msg.getPlot());
            event.setImage(msg.getImage());
            event.setParam(msg.getParam());
            event.setSitename(msg.getSitename());
            event.setTvtype(msg.getTvtype());
            event.setSiteurl(msg.getSiteurl());
            return event;
        }).collect(Collectors.toList());
        return list;
    }

    @Override
    public List<Map> getDownBox(MovieGetClassRequest movieGetClassRequest) {
        String tvtype = movieGetClassRequest.getTvtype();
        List<Map> result = null;
        if("电影".equals(tvtype)){
             result = movelTvdataMapper.selectDownBox(tvtype);
        }else if("电视剧".equals(tvtype)){
             result = movelTvdataMapper.selectDownBox(tvtype);
        }else if("综艺".equals(tvtype)){
            result = movelTvdataMapper.selectDownBox(tvtype);
        }else if("动漫".equals(tvtype)){
            result = movelTvdataMapper.selectDownBox(tvtype);
        }
        Map map = new HashMap();
        map.put("type","全部");
        result.add(map);
        return result;
    }


}
