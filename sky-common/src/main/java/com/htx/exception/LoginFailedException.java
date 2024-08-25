package com.htx.exception;

/**
 * 微信搜索「二哈学习之路」
 * 登录失败
 * @author htx
 * @date 2024/8/25 11:50
 */
public class LoginFailedException extends BaseException{
    public LoginFailedException(String msg){
        super(msg);
    }
}
