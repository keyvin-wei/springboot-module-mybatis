package com.keyvin.demo.api.config;

/**
 * @author weiwh
 * @date 2019/10/21 11:17
 */
public enum StatusCode {
    success(200, "成功！"),
    faild(400, "失败！"),
    invalidParam(201, "无效参数");

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
