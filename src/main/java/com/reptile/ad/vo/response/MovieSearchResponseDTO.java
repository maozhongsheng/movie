package com.reptile.ad.vo.response;

import lombok.Data;

import java.util.List;

@Data
public class MovieSearchResponseDTO {
    private Integer id;
    private String uuid;
    private Integer param;
    private String name;
    private String director;
    private String mainstar;
    private String image;
    private String tvtype;
    private String type;
    private String area;
    private String year;
    private String introduction;
    private List<MovieNum> urls;

}
