package com.htx.service;

import com.htx.vo.BusinessDataVO;
import com.htx.vo.DishOverViewVO;
import com.htx.vo.OrderOverViewVO;
import com.htx.vo.SetmealOverViewVO;
import java.time.LocalDateTime;

/**
 * 微信搜索「二哈学习之路」
 *
 * @author htx
 * @date 2024/8/28 21:56
 */
public interface WorkspaceService {

    /**
     * 根据时间段统计营业数据
     * @param begin
     * @param end
     * @return
     */
    BusinessDataVO getBusinessData(LocalDateTime begin, LocalDateTime end);

    /**
     * 查询订单管理数据
     * @return
     */
    OrderOverViewVO getOrderOverView();

    /**
     * 查询菜品总览
     * @return
     */
    DishOverViewVO getDishOverView();

    /**
     * 查询套餐总览
     * @return
     */
    SetmealOverViewVO getSetmealOverView();

}
