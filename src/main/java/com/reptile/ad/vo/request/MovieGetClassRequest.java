package com.reptile.ad.vo.request;

import lombok.Data;

@Data
public class MovieGetClassRequest {
    private String area;
    private String type;
    private String tvtype;
    private String year;
    private Integer limit = 10;
    private Integer page = 1;
}
