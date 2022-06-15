package com.reptile.ad.controller;


import com.reptile.ad.service.MovieService;
import com.reptile.ad.utils.LarkPageInfoVo;
import com.reptile.ad.vo.ResponseResult;
import com.reptile.ad.vo.request.MovieGetClassRequest;
import com.reptile.ad.vo.request.MovieSearchRequest;
import com.reptile.ad.vo.request.MovieTopTypeRequest;
import com.reptile.ad.vo.response.MovieGetClassResponseDTO;
import com.reptile.ad.vo.response.MovieRotationImgResponseDTO;
import com.reptile.ad.vo.response.MovieSearchResponseDTO;
import com.reptile.ad.vo.response.MovieTopTypeResponseDTO;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2022/5/20 18:21
 */
@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
public class MovieController {

    @Autowired
    public MovieService movieService;


    @ApiOperation(value = "全页面搜索接口")
    @RequestMapping(value = "search", method = RequestMethod.POST)
    public ResponseResult getAdSearch(@RequestBody MovieSearchRequest movieSearchRequest) throws Exception {
        List<MovieSearchResponseDTO> list = movieService.search(movieSearchRequest);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "轮播图接口")
    @RequestMapping(value = "rotationImg", method = RequestMethod.POST)
    public ResponseResult getRotationImg() throws Exception {
        List<MovieGetClassResponseDTO> list = movieService.getRotationImg();
        return new ResponseResult(list);
    }

    @ApiOperation(value = "轮播公告接口")
    @RequestMapping(value = "rotationAnnoce", method = RequestMethod.POST)
    public ResponseResult getRotationAnnoce() throws Exception {
        List<Map> list = movieService.getRotationAnnoce();
        return new ResponseResult(list);
    }

    @ApiOperation(value = "首页顶部分类接口")
    @RequestMapping(value = "topType", method = RequestMethod.POST)
    public ResponseResult getTopType(@RequestBody MovieTopTypeRequest movieTopTypeRequest) throws Exception {
        List<MovieTopTypeResponseDTO> list = movieService.getTopType(movieTopTypeRequest);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "首页展示接口")
    @RequestMapping(value = "getShow", method = RequestMethod.POST)
    public ResponseResult getShow() throws Exception {
        List<Map> list = movieService.getShow();
        return new ResponseResult(list);
    }

    @ApiOperation(value = "首页顶部分类名称接口")
    @RequestMapping(value = "topTypeName", method = RequestMethod.POST)
    public ResponseResult topTypeName() throws Exception {
        List<Map> list = movieService.topTypeName();
        return new ResponseResult(list);
    }

    @ApiOperation(value = "视频ID获取链接")
    @RequestMapping(value = "getUrl", method = RequestMethod.POST)
    public ResponseResult getMovieUrl(@RequestBody MovieTopTypeRequest movieTopTypeRequest) throws Exception {
        List<Map> list = movieService.getMovieUrl(movieTopTypeRequest);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "电影ID获取集数接口")
    @RequestMapping(value = "getNums", method = RequestMethod.POST)
    public ResponseResult getMovieNums(@RequestBody MovieTopTypeRequest movieTopTypeRequest) throws Exception {
        List<Map> list = movieService.getMovieNums(movieTopTypeRequest);
        return new ResponseResult(list);
    }
    @ApiOperation(value = "多片源电影ID获取集数接口")
    @RequestMapping(value = "getSourceNums", method = RequestMethod.POST)
    public ResponseResult getSourceNums(@RequestBody MovieTopTypeRequest movieTopTypeRequest) throws Exception {
        List<Map> list = movieService.getSourceNums(movieTopTypeRequest);
        return new ResponseResult(list);
    }

    @ApiOperation(value = "热门搜索接口")
    @RequestMapping(value = "hotSearch", method = RequestMethod.POST)
    public ResponseResult getMovieHotSearch() throws Exception {
        List<Map> list = movieService.getMovieHotSearch();
        return new ResponseResult(list);
    }

    @ApiOperation(value = "顶部栏目类别名称接口")
    @RequestMapping(value = "getClass", method = RequestMethod.POST)
    public ResponseResult getMovieClass(@RequestBody MovieGetClassRequest movieGetClassRequest) throws Exception {
        List<MovieGetClassResponseDTO> result = movieService.getMovieClass(movieGetClassRequest);
        return new ResponseResult(result);
    }

    @ApiOperation(value = "判断ab面接口")
    @RequestMapping(value = "getAb", method = RequestMethod.POST)
    public ResponseResult getAb() throws Exception {
        Map result = movieService.getAb();
        return new ResponseResult(result);
    }

    @ApiOperation(value = "获取类型下拉框")
    @RequestMapping(value = "getDownBox", method = RequestMethod.POST)
    public ResponseResult getDownBox(@RequestBody MovieGetClassRequest movieGetClassRequest) throws Exception {
        List<Map> result = movieService.getDownBox(movieGetClassRequest);
        return new ResponseResult(result);
    }

    public static void main(String[] args) {
        System.out.println("2");
    }
}
