package com.qihe.tliseProject.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qihe.tliseProject.mapper.EmpMapper;
import com.qihe.tliseProject.pojo.Emp;
import com.qihe.tliseProject.pojo.PageBean;
import com.qihe.tliseProject.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class EmpServiceA implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Override
    /*
    * 分页查询
    * */
    public PageBean listEmp( Integer page, Integer pageSize,String name, Short gender, LocalDate begin
            , LocalDate end) {
       /* Integer start=(page-1)*pageSize;
        List<Emp> list=empMapper.listEmp(start,pageSize,name,gender,begin,end);
        Long total=empMapper.count();*/
        PageHelper.startPage(page,pageSize);
        List<Emp> list=empMapper.listEmp(name,gender,begin,end);
        Page<Emp> p= (Page<Emp>) list;
        PageBean pb=new PageBean(p.getTotal(),p.getResult());
        return pb;
    }

    @Override
    public void deleteIds(int[] ids) {
        empMapper.deleteIds(ids);
    }

    @Override
    public void add(Emp emp) {
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        if(emp.getEntrydate()==null) {
            emp.setEntrydate(LocalDate.now());
        }
        emp.setPassword("123456");
        empMapper.add(emp);
    }
//根据id回显
    @Override
    public Emp selectById(Integer id) {
        return empMapper.selectById(id);
    }
//修改员工数据
    @Override
    public void update(Emp emp) {
        emp.setUpdateTime(LocalDateTime.now());
        empMapper.update(emp);
    }
}
