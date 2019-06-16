package com.awp.persistence.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * this class by created wuyongfei on 2019/6/16 16:32
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String id;
    private String mobile;
    private String userName;
    private String password;
    private String nickName;
    private String initPassword;
    private Boolean gender;
    private String email;
    private Timestamp createOn;
    private Timestamp updateOn;
    private Boolean deleted;
    private Integer value;
}