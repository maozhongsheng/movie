package com.reptile.ad.vo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MovieRotationImgResponseDTO {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String uuid;
    private String name;
    private String director;
    private String mainstar;
    private String image;
    private String tvtype;
    private String type;
    private String area;
    private String year;
    private String introduction;
    private String title;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String siteurl;
    private List<Map> urls;
}
