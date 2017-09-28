package com.sxs.common.session;

import java.io.Serializable;

/**
 * Created by wangpeng on 2016/11/7.
 */
public class BaseParameter implements Serializable {

    private static final long serialVersionUID = 1L;

    private String callback;

    public Object extendedParameter;

    public Object getExtendedParameter() {
        return extendedParameter;
    }

    public void setExtendedParameter(Object extendedParameter) {
        this.extendedParameter = extendedParameter;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
