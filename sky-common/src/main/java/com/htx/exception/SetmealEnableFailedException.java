package com.htx.exception;

/**
 * 微信搜索「二哈学习之路」
 * 套餐启用失败异常
 * @author htx
 * @date 2024/8/25 11:51
 */
public class SetmealEnableFailedException extends BaseException {

    public SetmealEnableFailedException(){}

    public SetmealEnableFailedException(String msg){
        super(msg);
    }
}
