package com.reptile.ad.vo;

import com.reptile.ad.utils.LarkPageInfoVo;

import java.util.List;

/**
 * TODO
 *
 * @author yjn
 * @version 1.0
 * @date 2021/1/18 18:24
 */
public interface PageEngine<T> {
    LarkPageInfoVo<T> pageZset(List<T> var1, Integer var2, Integer var3, Integer var4);
}
