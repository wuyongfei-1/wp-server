package com.awp.persistence.common;

import lombok.Getter;

@Getter
public enum ErrorCode {
    FIRST_ERROR_CODE(10001, "first of error enum"),


    LAST_ERROR_CODE(99999, "last of error enum");

    private Integer code;
    private String description;

    ErrorCode(Integer code, String description) {
        this.code = code;
        this.description = description;
    }
}
