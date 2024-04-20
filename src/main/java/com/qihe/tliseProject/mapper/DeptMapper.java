package com.qihe.tliseProject.mapper;

import com.qihe.tliseProject.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {
//查询部门
//    @Select("select * from dept")
    List<Dept> list();

   //   根据id删除部门
   void deleteId(Integer id);
//新增部门
   void insert(Dept dept);
//根据id查询数据
    Dept selectById(Integer id);

    void update(Dept dept);
}
