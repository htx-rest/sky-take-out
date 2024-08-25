package com.htx.exception;

/**
 * 微信搜索「二哈学习之路」
 * 账号不存在异常
 * @author htx
 * @date 2024/8/25 11:48
 */
public class AccountNotFoundException extends BaseException {

    public AccountNotFoundException() {
    }

    public AccountNotFoundException(String msg) {
        super(msg);
    }

}
