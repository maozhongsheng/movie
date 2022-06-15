package com.reptile.ad.controller;

import com.reptile.ad.service.XiangKanService;
import com.reptile.ad.service.YuleService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;

/**
 * TODO
 *
 * @author mzs
 * @version 1.0
 * @date 2022/5/19 13:21
 */

@Slf4j
@RestController
@CrossOrigin(value = "*", maxAge = 3600, allowCredentials = "true")
@EnableScheduling
public class ReptileController {

    @Autowired
    private YuleService yuleService;

    @Autowired
    private XiangKanService xiangKanService;

    /**
     * 定时获取平台数据
     * 时间为： 每天的 早上0：06分
     */
    @Scheduled(cron = "0 6 0 * * ?")
    public void getYuleDataDay() throws IOException, ParseException {
        //每天持续更新影片片源
        yuleService.getDadatuDataDay();
    }

    @ApiOperation(value = "鱼乐爬虫")
    @RequestMapping(value = "yulerun", method = RequestMethod.POST)
    public void getYuleData() throws IOException, ParseException {
        //设置片源获取视频相关数据
        yuleService.getYuleData();
    }

    @ApiOperation(value = "想看资源爬虫")
    @RequestMapping(value = "xiangkanrun", method = RequestMethod.POST)
    public void getXiangKanData() throws IOException, ParseException {
        //设置片源获取视频相关数据
        xiangKanService.getXiangKanData();
    }

}
