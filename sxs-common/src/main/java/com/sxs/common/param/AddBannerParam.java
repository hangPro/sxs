package com.sxs.common.param;

import com.sxs.common.session.BaseParameter;

/**
 * Created by hang on 2017/2/24.
 */
public class AddBannerParam extends BaseParameter {

    private String bannerName;

    private Integer bannerType;

    private String path;

    private Integer status;

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public Integer getBannerType() {
        return bannerType;
    }

    public void setBannerType(Integer bannerType) {
        this.bannerType = bannerType;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
