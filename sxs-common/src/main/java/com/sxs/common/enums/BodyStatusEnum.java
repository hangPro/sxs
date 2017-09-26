package com.sxs.common.enums;

/**
 * Created by hang on 2017/2/27.
 */
public enum BodyStatusEnum {

    NO(1,"否"),
    YES(2,"是"),
    ;

    private Integer code;

    private String message;

    BodyStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String getEnumMessageByCode(String code){
        for(BodyStatusEnum productTypeEnum : values()){
            if(productTypeEnum.getCode().equals(code)){
                return productTypeEnum.getMessage();
            }
        }
        return null;
    }
}
