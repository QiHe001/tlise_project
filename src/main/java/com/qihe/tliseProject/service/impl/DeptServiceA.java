package com.qihe.tliseProject.service.impl;

import com.qihe.tliseProject.mapper.DeptMapper;
import com.qihe.tliseProject.pojo.Dept;
import com.qihe.tliseProject.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptServiceA implements DeptService {
    @Autowired
    private DeptMapper deptmapper;
    /*
    * 查询部门
    * */
    @Override
    public List<Dept> listDept() {
        return deptmapper.list();
    }

//根据id删除部门
    @Override
    public void deleteDept(Integer id) {
        deptmapper.deleteId(id);
    }
/*
* 新增部门
* */
    @Override
    public void addDept(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptmapper.insert(dept);
    }
/*
* 根据id查询数据
* */
    @Override
    public Dept selectById(Integer id) {
        Dept dept=deptmapper.selectById(id);
        return dept;
    }
/*
* 修改部门信息
* */
    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptmapper.update(dept);
    }
}
