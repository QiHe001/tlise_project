package com.qihe.tliseProject.service;

import com.qihe.tliseProject.pojo.Dept;

import java.util.List;

public interface DeptService {
     List<Dept> listDept();
     void deleteDept(Integer id);

    void addDept(Dept dept);

    Dept selectById(Integer id);

    void update(Dept dept);
}
