package com.sxs.common.param;

import com.sxs.common.base.WebPageParameter;

/**
 * Created by hang on 2017/2/25.
 */
public class QuerySeasonParam extends WebPageParameter{

    private String name;

    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
