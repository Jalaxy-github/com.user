package com.xiaoyu.springcloud.service.impl;

import com.xiaoyu.springcloud.dao.EmployeeDao;
import com.xiaoyu.springcloud.entities.CommonResult;
import com.xiaoyu.springcloud.entities.Employee;
import com.xiaoyu.springcloud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    EmployeeDao employeeDao;

    @Override
    public int addEmployee(Employee employee) {

        int effectedNum = employeeDao.insertEmployee(employee);
        return effectedNum;

    }

    @Override
    public Employee getEmployeeById(int id) {
        Employee employee = employeeDao.queryEmployeeById(id);
        return employee;
    }

    @Override
    public int updateEmployeeById(Employee employee) {
        int effectedNum = employeeDao.updateEmployeeById(employee);
        return effectedNum;
    }

    @Override
    public int deleteEmployeeById(int id) {
        int effectedNum = employeeDao.deleteEmployeeById(id);
        return effectedNum;
    }


}
