package com.xiaoyu.springcloud.controller;

import com.xiaoyu.springcloud.entities.CommonResult;
import com.xiaoyu.springcloud.entities.Employee;
import com.xiaoyu.springcloud.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
@RequestMapping(value = "/admin")
@ResponseBody
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    //增
    @PostMapping(value = "/createEmployee")
    public CommonResult create(Employee employee){
        int  result = employeeService.addEmployee(employee);
        log.info("*****插入结果："+result);
        if (result>0){  //成功
            return new CommonResult(200,"插入数据库成功" ,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }
    //查
    @GetMapping(value = "/getEmployeeById")
    public CommonResult<Employee> getEmployeeById(int id){
        Employee result = employeeService.getEmployeeById(id);
        log.info("*****插入结果："+result);
        if (result != null){  //成功
            return new CommonResult(200,"查询成功" ,result);
        }else {
            return new CommonResult(444,"查询失败",null);
        }
    }
    //改
    @PostMapping(value = "/updateEmployeeById")
    public CommonResult updateEmployeeById(Employee employee){
        int result = employeeService.updateEmployeeById(employee);
        log.info("*****修改结果："+result);
        if (result>0){  //成功
            return new CommonResult(200,"修改数据库成功" ,result);
        }else {
            return new CommonResult(444,"修改数据库失败",null);
        }
    }
    //删除员工
    @PostMapping(value = "/deleteEmployeeById")
    public  CommonResult deleteEmployeeById(int id){
        int result = employeeService.deleteEmployeeById(id);
        log.info("*****修改结果："+result);
        if (result>0){  //成功
            return new CommonResult(200,"删除数据成功" ,result);
        }else {
            return new CommonResult(444,"删除数据失败",null);
        }

    }


}
