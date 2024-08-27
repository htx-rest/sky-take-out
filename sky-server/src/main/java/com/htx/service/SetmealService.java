package com.htx.service;

import com.htx.dto.SetmealDTO;
import com.htx.dto.SetmealPageQueryDTO;
import com.htx.entity.Setmeal;
import com.htx.result.PageResult;
import com.htx.vo.DishItemVO;
import com.htx.vo.SetmealVO;
import java.util.List;

/**
 * 微信搜索「二哈学习之路」
 *
 * @author htx
 * @date 2024/8/27 23:06
 */
public interface SetmealService {

    /**
     * 条件查询
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);

    /**
     * 根据id查询菜品选项
     * @param id
     * @return
     */
    List<DishItemVO> getDishItemById(Long id);

}
