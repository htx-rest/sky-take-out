package com.htx.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.htx.constant.MessageConstant;
import com.htx.constant.StatusConstant;
import com.htx.dto.SetmealDTO;
import com.htx.dto.SetmealPageQueryDTO;
import com.htx.entity.Dish;
import com.htx.entity.Setmeal;
import com.htx.entity.SetmealDish;
import com.htx.exception.DeletionNotAllowedException;
import com.htx.exception.SetmealEnableFailedException;
import com.htx.mapper.DishMapper;
import com.htx.mapper.SetmealDishMapper;
import com.htx.mapper.SetmealMapper;
import com.htx.result.PageResult;
import com.htx.service.SetmealService;
import com.htx.vo.DishItemVO;
import com.htx.vo.SetmealVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * 微信搜索「二哈学习之路」
 * 套餐业务实现
 * @author htx
 * @date 2024/8/27 23:06
 */
@Service
@Slf4j
public class SetmealServiceImpl implements SetmealService {

    @Autowired
    private SetmealMapper setmealMapper;
    @Autowired
    private SetmealDishMapper setmealDishMapper;
    @Autowired
    private DishMapper dishMapper;

    /**
     * 条件查询
     * @param setmeal
     * @return
     */
    public List<Setmeal> list(Setmeal setmeal) {
        List<Setmeal> list = setmealMapper.list(setmeal);
        return list;
    }

    /**
     * 根据id查询菜品选项
     * @param id
     * @return
     */
    public List<DishItemVO> getDishItemById(Long id) {
        return setmealMapper.getDishItemBySetmealId(id);
    }
}
