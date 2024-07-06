package com.example.backend.Controller;


import com.example.backend.Controller.request.EmployeePageRequest;
import com.example.backend.Entity.Employee;
import com.example.backend.Mapper.EmployeeMapper;

import com.example.backend.Service.EmployeeService;
import com.example.backend.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//接口大致分为查询所有的、分页查询的、按id查询的、增删改

@CrossOrigin            //解决跨域问题
@RestController
@RequestMapping("/Staff")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @DeleteMapping("/delete/{id}")
    public Result deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
        return Result.success();
    }

    @PostMapping("/update")
    public Result updateEmployee(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
        return Result.success();
    }

    @PostMapping("/add")//增加用户的前端接口
    public Result addEmployee(@RequestBody Employee employee) {//将json转为实体对象
        employeeService.addEmployee(employee);
        return Result.success();    //告诉前端接受到了请求，请求成功
    }

    @GetMapping("/List")
    public Result SelectEmployees() {
        List<Employee> employees = employeeService.SelectEmployees();
        return Result.success(employees);
       // return Result.success(employeeMapper.SelectEmployees());
    }

    @GetMapping("/Page")
    public Result Page(EmployeePageRequest employeePageRequest) {
        return Result.success(employeeService.page(employeePageRequest));
        // return Result.success(employeeMapper.SelectEmployees());
    }
}
