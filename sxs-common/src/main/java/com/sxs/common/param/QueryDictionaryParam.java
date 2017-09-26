package com.sxs.common.param;

import com.sxs.common.session.WebPageParameter;

/**
 * Created by hang on 2017/2/25.
 */
public class QueryDictionaryParam extends WebPageParameter{

    private String dicType;

    private String dicKey;

    private String dicValue;

    public String getDicType() {
        return dicType;
    }

    public void setDicType(String dicType) {
        this.dicType = dicType;
    }

    public String getDicKey() {
        return dicKey;
    }

    public void setDicKey(String dicKey) {
        this.dicKey = dicKey;
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue;
    }
}
