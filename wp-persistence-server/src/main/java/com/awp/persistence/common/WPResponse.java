package com.awp.persistence.common;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * this class by created wuyongfei on 2019/6/16 17:52
 **/
@Getter
public class WPResponse {
    private final HttpStatus status;
    private final Integer code;
    private final Object data;
    private final String message;

    public WPResponse(HttpStatus status, String message, Object data) {
        this.message = message;
        this.data = data;
        this.status = status;
        this.code = 200;
    }

    public WPResponse(HttpStatus status, ErrorCode code, String message, Object data) {
        this.message = message;
        this.data = data;
        this.status = status;
        this.code = code.getCode();
    }
}
