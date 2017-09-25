package com.sxs.common.enums;

/**
 * Created by hang on 2017/2/27.
 */
public enum ProductTypeEnum {

    SHIRT("1","衬衫"),
    SUITS("2","西装"),
    MAJIA("3","马甲"),
    ;

    private String code;

    private String message;

    ProductTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static String getEnumMessageByCode(String code){
        for(ProductTypeEnum productTypeEnum : values()){
            if(productTypeEnum.getCode().equals(code)){
                return productTypeEnum.getMessage();
            }
        }
        return null;
    }
}
