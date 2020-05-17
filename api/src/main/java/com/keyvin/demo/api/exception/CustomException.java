package com.keyvin.demo.api.exception;

import com.keyvin.demo.api.config.ResponseEnum;

/**
 * 自定义异常
 * @author weiwh
 * @date 2020/5/17 10:51
 */
public class CustomException extends RuntimeException {
    private Integer code;

    public CustomException() {
        super();
    }

    public CustomException(Integer code) {
        super(ResponseEnum.getMessage(code));
        this.setCode(code);
    }

    public CustomException(Integer code, String message) {
        super(message);
        this.setCode(code);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
