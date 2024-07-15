package com.example.backend.Controller;


import cn.hutool.core.util.StrUtil;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.example.backend.Controller.request.EmployeePageRequest;
import com.example.backend.Entity.Employee;
import com.example.backend.Mapper.EmployeeMapper;

import com.example.backend.Service.EmployeeService;
import com.example.backend.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/Ringchart")
    public Result getRingchart() {
        List<Map<String, Object>> list = employeeService.getEmployeeTypeCounts();
        return Result.success(list);
    }
    /*
    * 批量导出
    * */
    @GetMapping("/export")
    public void exportData(@RequestParam(required = false) String employeeId,HttpServletResponse response) throws IOException {
        ExcelWriter writer=ExcelUtil.getWriter(true);
        List<Employee> list = new ArrayList<>();
        if(StrUtil.isBlank(employeeId)){
            list = employeeService.SelectEmployees();           //导出所有数据
        }
        writer.write(list,true);

        //导出文件格式
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
        response.setHeader("Content-Disposition","attachment;filename="+ URLEncoder.encode("员工信息表","UTF-8")+".xlsx");
        ServletOutputStream outputStream = response.getOutputStream();//拿到所有数据
        writer.flush( outputStream ,true);
        writer.close();
        outputStream.flush();
        outputStream.close();
    }

    /*
    * 批量导入
    * */
//    @PostMapping("/import")
//    public Result importData(@RequestParam MultipartFile file) throws IOException {
//        ExcelReader reader = ExcelUtil.getReader(file.getInputStream());
//        reader.readAll();
//    }
}
