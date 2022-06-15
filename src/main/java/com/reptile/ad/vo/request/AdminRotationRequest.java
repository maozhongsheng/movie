package com.reptile.ad.vo.request;

import lombok.Data;

@Data
public class AdminRotationRequest {

    private Integer id;

    private String title;

    private String url;

    private String content;

    private String type;

    private String uuid;

    private String name;

    private Integer limit = 10;

    private Integer page = 1;

    private static final long serialVersionUID = 1L;
}
