package com.cn.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 用户登录信息表
 */
@Entity
@Data
public class UserLoginTbl {
    /**
     * 用户ID
     */
    @Id
    private Integer id;

    /**
     *用户名（手机号作为登录唯一标识）
     */
    private String accName;

    /**
     *密码（加密后的字符串）
     */
    private String password;
}
