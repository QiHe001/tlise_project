package com.qihe.tliseProject.controller;

import com.qihe.tliseProject.pojo.Emp;
import com.qihe.tliseProject.pojo.PageBean;
import com.qihe.tliseProject.pojo.Result;
import com.qihe.tliseProject.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@Slf4j
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;
//    @PathVariable String name, Short gender, LocalDate begin, LocalDate end,
//    分页查询，条件查询
    @GetMapping
    public Result selectLimit(@RequestParam(defaultValue = "1") Integer page,
                              @RequestParam(defaultValue = "10")Integer pageSize,
                              String name,
                              Short gender,
                              @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                              @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end) {
        PageBean pb=empService.listEmp(page,pageSize,name,gender,begin,end);
        log.info("分页查询参数：{},{},{},{},{},{}",page,pageSize,name,gender,begin,end);
        return Result.Success(pb);
    }
//    删除，单一，批量删除
    @DeleteMapping("/{ids}")
    public Result deleteIds(@PathVariable int[] ids){
        empService.deleteIds(ids);
        log.info("ids");
        return Result.Success();
    }
//    添加（新增）
    @PostMapping
    public Result add(@RequestBody Emp emp){
        empService.add(emp);
        log.info("添加的员工信息：{}",emp);
        return Result.Success();
    }
//   根据id回显数据
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        Emp emp= empService.selectById(id);
        log.info("回显的员工Id为：{}",id);
        return Result.Success(emp);
    }
//    根据回显数据进行修改
    @PutMapping
    public Result update(@RequestBody Emp emp){
        empService.update(emp);
        log.info("修改员工数据为：{}",emp);
        return Result.Success();
    }



}
