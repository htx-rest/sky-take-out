package com.htx.service;

import com.htx.dto.EmployeeDTO;
import com.htx.dto.EmployeeLoginDTO;
import com.htx.dto.EmployeePageQueryDTO;
import com.htx.entity.Employee;
import com.htx.result.PageResult;

/**
 * 微信搜索「二哈学习之路」
 *
 * @author htx
 * @date 2024/8/25 15:24
 */
public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);
}
