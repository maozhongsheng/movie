package com.reptile.ad.vo.request;

import lombok.Data;

@Data
public class MovieSearchRequest {
    private String key_word;//用户输入的视频名称或演员名字
    private String type;//1-视频名称，2-演员名字

}
