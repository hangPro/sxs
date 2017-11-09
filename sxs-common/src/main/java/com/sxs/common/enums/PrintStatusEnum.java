package com.sxs.common.enums;

/**
 * Created by hang on 2017/2/27.
 */
public enum PrintStatusEnum {

    ONE(1,"未打印"),
    TWO(2,"已打印"),
    ;

    private Integer code;

    private String message;

    PrintStatusEnum(Integer code, String message) {
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
        for(PrintStatusEnum productTypeEnum : values()){
            if(productTypeEnum.getCode().equals(code)){
                return productTypeEnum.getMessage();
            }
        }
        return null;
    }
}
