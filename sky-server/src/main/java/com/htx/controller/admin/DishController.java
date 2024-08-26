package com.htx.controller.admin;

import com.htx.dto.DishDTO;
import com.htx.dto.DishPageQueryDTO;
import com.htx.entity.Dish;
import com.htx.result.PageResult;
import com.htx.result.Result;
import com.htx.service.DishService;
import com.htx.vo.DishVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Set;

/**
 * 微信搜索「二哈学习之路」
 * 菜品管理
 * @author htx
 * @date 2024/8/26 23:36
 */
@RestController
@RequestMapping("/admin/dish")
@Api(tags = "菜品相关接口")
@Slf4j
public class DishController {

    @Autowired
    private DishService dishService;

    /**
     * 新增菜品
     *
     * @param dishDTO
     * @return
     */
    @PostMapping
    @ApiOperation("新增菜品")
    public Result save(@RequestBody DishDTO dishDTO) {
        log.info("新增菜品：{}", dishDTO);
        dishService.saveWithFlavor(dishDTO);//后绪步骤开发
        return Result.success();
    }
}
