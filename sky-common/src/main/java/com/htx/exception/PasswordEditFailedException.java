package com.htx.exception;

/**
 * 微信搜索「二哈学习之路」
 * 密码修改失败异常
 * @author htx
 * @date 2024/8/25 11:50
 */
public class PasswordEditFailedException extends BaseException{

    public PasswordEditFailedException(String msg){
        super(msg);
    }

}
