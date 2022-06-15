package com.reptile.ad.vo;

import com.reptile.ad.utils.LarkPageInfoVo;

import java.util.List;

/**
 * TODO
 *
 * @author yjn
 * @version 1.0
 * @date 2021/1/18 18:23
 */
public class PageImpl<T> implements PageEngine<T> {
    public PageImpl() {
    }

    public LarkPageInfoVo<T> pageZset(List<T> list, Integer total, Integer pageSize, Integer pageNum) {
        if (pageSize < 1) {
            pageSize = 1;
        }

        if (pageNum < 1) {
            pageNum = 1;
        }

        Integer pages = this.pages(total, pageSize);
        if (pageNum >= pages) {
            pageNum = pages;
        }

        LarkPageInfoVo vo = new LarkPageInfoVo();
        vo.setPageNum(pageNum);
        vo.setPageSize(pageSize);
        this.start(pageSize, pageNum);
        this.end(pageSize, pageNum);
        vo.setSize(list.size());
        vo.setTotal((long)total);
        vo.setPages(pages);
        vo.setList(list);
        if (pageNum == 1) {
            vo.setIsFirstPage(true);
        } else {
            vo.setIsFirstPage(false);
        }

        if (pageNum >= pages) {
            vo.setIsLastPage(true);
        } else {
            vo.setIsLastPage(false);
        }

        vo.setFirstPage(1);
        vo.setLastPage(pages);
        return vo;
    }

    private Integer start(Integer pageSize, Integer pageNum) {
        return pageSize * (pageNum - 1);
    }

    private Integer end(Integer pageSize, Integer pageNum) {
        return pageSize * (pageNum - 1) + pageSize - 1;
    }

    private Integer pages(Integer total, Integer pageSize) {
        Integer pages = total / pageSize;
        Integer rema = total % pageSize;
        if (rema > 0) {
            pages = pages + 1;
        }

        return pages;
    }
}
