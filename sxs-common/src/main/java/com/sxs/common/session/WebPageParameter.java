package com.sxs.common.session;

import com.sxs.common.constats.GlobConts;

/**
 * Created by hang on 2017/1/6.
 */
public class WebPageParameter extends SessionParameter {

    private Integer requestOffset;
    private Integer requestCount;
    private Integer page;
    private Integer pageSize = GlobConts.DEFUALT_PAGE_SIZE;

    public Integer getRequestOffset() {
        return requestOffset;
    }

    public void setRequestOffset(Integer requestOffset) {
        this.requestOffset = requestOffset;
    }

    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 计算分页起始行
     */
    public void calculatePageLimit() {
        if (page == null) {
            page = 1;
        }
        if (pageSize == null) {
            pageSize = GlobConts.DEFUALT_PAGE_SIZE;
        }
        this.requestOffset = (page - 1) * pageSize + 1;
        this.requestCount = page * pageSize;
    }
}
