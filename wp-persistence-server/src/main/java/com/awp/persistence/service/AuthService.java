package com.awp.persistence.service;

import com.awp.persistence.common.WPException;
import com.awp.persistence.dto.AccountAuthDto;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
public interface AuthService {
    AccountAuthDto authByUserNameAndPassword(String userName, String password) throws WPException;
}
