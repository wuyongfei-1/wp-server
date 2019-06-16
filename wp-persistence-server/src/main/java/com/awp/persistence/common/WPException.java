package com.awp.persistence.common;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;

/**
 * this class by created wuyongfei on 2019/6/16 18:09
 **/
@Getter
@Slf4j
public class WPException extends RuntimeException {
    private final ErrorCode errorCode;
    private final Object data;
    private final HttpStatus status;
    private final String message;

    /**
     * catch exception
     * @param status
     * @param errorCode
     * @param e
     */
    public WPException(HttpStatus status, ErrorCode errorCode, Exception e) {
        this.errorCode = errorCode;
        this.status = status;
        this.data = e.getMessage();
        this.message = e.getMessage();
        this.printStackTrace();
    }

    /**
     * manual throw custom exception
     * @param status
     * @param errorCode
     * @param data
     */
    public WPException(HttpStatus status, ErrorCode errorCode, Object... data) {
        this.errorCode = errorCode;
        this.status = status;
        this.data = data;
        this.message =errorCode.getDescription();
    }
}
