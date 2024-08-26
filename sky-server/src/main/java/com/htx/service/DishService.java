package com.htx.service;

import com.htx.dto.DishDTO;
import com.htx.entity.Dish;

/**
 * 微信搜索「二哈学习之路」
 *
 * @author htx
 * @date 2024/8/26 23:37
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味
     *
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
