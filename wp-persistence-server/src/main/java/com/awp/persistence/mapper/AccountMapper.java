package com.awp.persistence.mapper;

import com.awp.persistence.dto.AccountAuthDto;
import org.apache.ibatis.annotations.Param;


/**
 * this class by created wuyongfei on 2018/6/5 13:50
 **/
public interface AccountMapper {
    AccountAuthDto getAccountByUserNameAndPassword(@Param(value = "userName") String userName,
                                                   @Param(value = "password")String password);
}
