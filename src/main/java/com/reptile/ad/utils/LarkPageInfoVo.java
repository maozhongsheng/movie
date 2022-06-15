package com.reptile.ad.utils;

import lombok.Data;
import java.util.Collection;

/**
 * TODO
 *
 * @author yjn
 * @version 1.0
 * @date 2021/1/18 15:44
 */
public class LarkPageInfoVo<T> {

    private static final long serialVersionUID = 1L;

    private int pageNum;
    private int pageSize;
    private int size;
    private long total;
    private int pages;
    private Collection<T> list;
    private boolean isFirstPage;
    private boolean isLastPage;
    private int firstPage;
    private int lastPage;

    public LarkPageInfoVo() {
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Collection<T> getList() {
        return this.list;
    }

    public void setList(Collection<T> list) {
        this.list = list;
    }

    public boolean getIsFirstPage() {
        return this.isFirstPage;
    }

    public void setIsFirstPage(boolean firstPage) {
        this.isFirstPage = firstPage;
    }

    public boolean getIsLastPage() {
        return this.isLastPage;
    }

    public void setIsLastPage(boolean lastPage) {
        this.isLastPage = lastPage;
    }

    public int getFirstPage() {
        return this.firstPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public int getLastPage() {
        return this.lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }
}
