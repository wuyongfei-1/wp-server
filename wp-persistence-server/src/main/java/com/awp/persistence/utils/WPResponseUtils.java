package com.awp.persistence.utils;

import com.awp.persistence.common.ErrorCode;
import com.awp.persistence.common.WPException;
import com.awp.persistence.common.WPResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * this class by created wuyongfei on 2019/6/16 17:40
 **/
@Component
public class WPResponseUtils {
    /**
     * catch WPException
     *
     * @param status
     * @param errorCode
     * @param wpException
     * @return
     */
    public ResponseEntity newResponse(HttpStatus status, ErrorCode errorCode, WPException wpException) {
        WPResponse response = new WPResponse(status, errorCode, wpException.getMessage(), wpException.getData());
        return new ResponseEntity(response, response.getStatus());
    }

    /**
     * catch exception
     *
     * @param status
     * @param errorCode
     * @param e
     * @param data
     * @return
     */
    public ResponseEntity newResponse(HttpStatus status, ErrorCode errorCode, Exception e, Object... data) {
        WPResponse response = new WPResponse(status, errorCode, e.getMessage(), data);
        return new ResponseEntity(response, response.getStatus());
    }

    /**
     * success response
     *
     * @param status
     * @param message
     * @param data
     * @return
     */
    public ResponseEntity ok(HttpStatus status, String message, Object... data) {
        Object result;
        if (data != null && data.length == 1) {
            result = data[0];
        } else {
            result = data;
        }
        WPResponse response = new WPResponse(status, message, result);
        return new ResponseEntity(response, response.getStatus());
    }
}
