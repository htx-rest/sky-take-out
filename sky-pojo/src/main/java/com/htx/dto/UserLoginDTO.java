package com.htx.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 微信搜索「二哈学习之路」
 * C端用户登录
 * @author htx
 * @date 2024/8/25 14:59
 */
@Data
public class UserLoginDTO implements Serializable {

    private String code;

}

