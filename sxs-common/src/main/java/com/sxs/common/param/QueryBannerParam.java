package com.sxs.common.param;

import com.sxs.common.base.WebPageParameter;

/**
 * Created by hang on 2017/2/24.
 */
public class QueryBannerParam extends WebPageParameter {


    /**
     * 状态: @see StatusEnum
     * ENABLE(0,"启用"),
     * DISABLED(1,"禁用"),
     */
    private Integer status;

    private Integer bannerType;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBannerType() {
        return bannerType;
    }

    public void setBannerType(Integer bannerType) {
        this.bannerType = bannerType;
    }
}
