package com.keyvin.demo.api.config;

/**
 * @author weiwh
 * @date 2020/5/17 0:56
 */
public enum ResponseEnum {
    SUCCESS(200, "成功"),
    INNER_SERVER_ERROR(500, "系统内部错误");

    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String message;

    ResponseEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMessage(Integer code){
        for(ResponseEnum anEnum: ResponseEnum.values()){
            if(anEnum.getCode() == code){
                return anEnum.message;
            }
        }
        return null;
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
}
