package com.reptile.ad.service;

import com.reptile.ad.utils.LarkPageInfoVo;
import com.reptile.ad.vo.request.MovieGetClassRequest;
import com.reptile.ad.vo.request.MovieSearchRequest;
import com.reptile.ad.vo.request.MovieTopTypeRequest;
import com.reptile.ad.vo.response.MovieGetClassResponseDTO;
import com.reptile.ad.vo.response.MovieRotationImgResponseDTO;
import com.reptile.ad.vo.response.MovieSearchResponseDTO;
import com.reptile.ad.vo.response.MovieTopTypeResponseDTO;

import java.util.List;
import java.util.Map;

public interface MovieService {
    List<MovieSearchResponseDTO> search(MovieSearchRequest movieSearchRequest);

    List<MovieGetClassResponseDTO> getRotationImg();

    List<Map> getRotationAnnoce();

    List<MovieTopTypeResponseDTO> getTopType(MovieTopTypeRequest movieTopTypeRequest);

    List<Map> getShow();

    List<Map> topTypeName();

    List<Map> getMovieUrl(MovieTopTypeRequest movieTopTypeRequest);

    List<Map> getMovieNums(MovieTopTypeRequest movieTopTypeRequest);

    List<Map> getMovieHotSearch();

    Map getAb();

    List<MovieGetClassResponseDTO> getMovieClass(MovieGetClassRequest movieGetClassRequest);

    List<Map> getDownBox(MovieGetClassRequest movieGetClassRequest);

    List<Map> getSourceNums(MovieTopTypeRequest movieTopTypeRequest);
}
