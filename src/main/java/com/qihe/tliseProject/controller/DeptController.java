package com.qihe.tliseProject.controller;

import com.alibaba.fastjson.JSONObject;
import com.qihe.tliseProject.pojo.Dept;
import com.qihe.tliseProject.pojo.Result;
import com.qihe.tliseProject.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {
    @Autowired
    private DeptService deptService;
/*
* 查询部门数据
*
* */
    @GetMapping
    public Result deptSelect(){
        List<Dept> deptlist=deptService.listDept();
        log.info("查询全部数据");
        return Result.Success(deptlist);
    }

    /*
    * 删除指定id的部门信息
    * */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        deptService.deleteDept(id);
        log.info("id为"+id+"的部门信息成功删除");
        return Result.Success();
    }
    /*
    * 新增部门
    * */
   @PostMapping
    public Result add(@RequestBody Dept dept){
        log.info("新增部门：{}",dept);
        deptService.addDept(dept);
        return Result.Success();
    }
    /*
    * 编辑部门
    * 1，根据id查询部门
    * 2.根据id修改部门
    * */
//    根据id查询
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        log.info("回显部门数据的id为：{}",id);
       Dept dept=deptService.selectById(id);
       return Result.Success(dept);
    }
//    修改部门
    @PutMapping
    public Result update(@RequestBody Dept dept){
//        Dept dept=depts.get(0);
        log.info("修改部门信息:{}",dept);
        deptService.update(dept);
        return Result.Success();
    }

}
