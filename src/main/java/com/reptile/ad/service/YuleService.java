package com.reptile.ad.service;

import java.io.IOException;
import java.text.ParseException;

public interface YuleService {
    /**
     *
     *
     * @author mzs
     * @version 1.0
     * @date 2021/3/8 13:22
     */
    void getYuleData() throws IOException, ParseException;

    void getDadatuDataDay() throws IOException, ParseException;
}
