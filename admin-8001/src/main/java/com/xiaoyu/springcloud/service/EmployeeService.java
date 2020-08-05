package com.xiaoyu.springcloud.service;

import com.xiaoyu.springcloud.entities.CommonResult;
import com.xiaoyu.springcloud.entities.Employee;

public interface EmployeeService {
    int addEmployee(Employee employee);

    Employee getEmployeeById(int id);

    int updateEmployeeById(Employee employee);

    int deleteEmployeeById(int id);
}
