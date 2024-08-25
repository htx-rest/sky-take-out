package com.htx.exception;

/**
 * 微信搜索「二哈学习之路」
 * 账号被锁定异常
 * @author htx
 * @date 2024/8/25 11:47
 */
public class AccountLockedException extends BaseException {

    public AccountLockedException() {
    }

    public AccountLockedException(String msg) {
        super(msg);
    }

}
