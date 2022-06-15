package com.reptile.ad.vo.response;

import lombok.Data;

import java.util.Date;

@Data
public class AdminRotationResponseDTO {
    private Integer id;
    private String title;
    private String url;
    private String content;
    private Date create_time;
    private Date update_time;
}
