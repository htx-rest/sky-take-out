package com.htx.exception;

/**
 * 微信搜索「二哈学习之路」
 * 密码错误异常
 * @author htx
 * @date 2024/8/25 11:51
 */
public class PasswordErrorException extends BaseException {

    public PasswordErrorException() {
    }

    public PasswordErrorException(String msg) {
        super(msg);
    }

}
