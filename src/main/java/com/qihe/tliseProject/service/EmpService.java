package com.qihe.tliseProject.service;

import com.qihe.tliseProject.pojo.Emp;
import com.qihe.tliseProject.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;
/*String name, short gender, LocalDate begin
        , LocalDate end,*/
public interface EmpService {
    public PageBean listEmp( Integer page, Integer pageSize,String name, Short gender, LocalDate begin
            , LocalDate end);

    void deleteIds(int[] ids);

    void add(Emp emp);

    Emp selectById(Integer id);

    void update(Emp emp);
}
