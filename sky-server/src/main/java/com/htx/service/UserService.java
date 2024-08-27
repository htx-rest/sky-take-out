package com.htx.service;

import com.htx.dto.UserLoginDTO;
import com.htx.entity.User;

/**
 * 微信搜索「二哈学习之路」
 *
 * @author htx
 * @date 2024/8/27 22:48
 */
public interface UserService {

    /**
     * 微信登录
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
