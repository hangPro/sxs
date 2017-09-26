package com.sxs.common.param;

import com.sxs.common.session.WebPageParameter;

/**
 * Created by hang on 2017/2/24.
 */
public class QueryFrontShowParam extends WebPageParameter {

    private Long seasonId;

    private Boolean menuStatus = Boolean.FALSE;

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    public Boolean getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Boolean menuStatus) {
        this.menuStatus = menuStatus;
    }
}
