package com.reptile.ad.vo.request;

import lombok.Data;

@Data
public class MovieTopTypeRequest {
    private String type;
    private String v_id;
    private String m_id;
    private Integer limit = 10;
    private Integer page = 1;


}
