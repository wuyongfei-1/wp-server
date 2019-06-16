package com.awp.persistence.service.impl;

import com.awp.persistence.common.ErrorCode;
import com.awp.persistence.common.WPException;
import com.awp.persistence.dto.AccountAuthDto;
import com.awp.persistence.mapper.AccountMapper;
import com.awp.persistence.service.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * this class by created wuyongfei on 2019/6/16 16:40
 **/
@Service
public class AuthServiceImpl implements AuthService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public AccountAuthDto authByUserNameAndPassword(String userName, String password) throws WPException {
        AccountAuthDto account = accountMapper.getAccountByUserNameAndPassword(userName, password);
        return Optional.ofNullable(account).orElseThrow(() -> new WPException(HttpStatus.NOT_FOUND, ErrorCode.FIRST_ERROR));
    }
}