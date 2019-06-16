package com.awp.persistence.web;

import com.awp.persistence.common.ErrorCode;
import com.awp.persistence.common.WPException;
import com.awp.persistence.dto.AccountAuthDto;
import com.awp.persistence.service.AccountService;
import com.awp.persistence.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * this class by created wuyongfei on 2019/6/16 16:40
 **/
@RestController
public class AuthController extends CommonController {

    @Autowired
    private AuthService authService;

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/account/auth/convention")
    public ResponseEntity authByUserNameAndPassword(@RequestParam String userName,
                                                    @RequestParam String password) {
        try {
            AccountAuthDto accountAuthDto = authService.authByUserNameAndPassword(userName, password);
            return wpResponseUtils.ok(HttpStatus.OK, "got account data.", accountAuthDto);
        } catch (WPException e) {
            return wpResponseUtils.newResponse(e.getStatus(), e.getErrorCode(), e);
        } catch (Exception e) {
            return wpResponseUtils.newResponse(HttpStatus.METHOD_NOT_ALLOWED, ErrorCode.FIRST_ERROR_CODE, e);
        }
    }
}