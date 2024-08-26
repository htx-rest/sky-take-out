package com.htx.annotation;

import com.htx.enumeration.OperationType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 微信搜索「二哈学习之路」
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 * @author htx
 * @date 2024/8/26 23:05
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型：UPDATE INSERT
    OperationType value();
}
