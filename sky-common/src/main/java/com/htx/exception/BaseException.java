package com.htx.exception;

/**
 * 微信搜索「二哈学习之路」
 * 业务异常
 * @author htx
 * @date 2024/8/25 11:49
 */
public class BaseException extends RuntimeException {

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }

}
