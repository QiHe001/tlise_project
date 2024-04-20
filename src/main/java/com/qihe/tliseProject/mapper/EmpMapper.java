package com.qihe.tliseProject.mapper;

import com.qihe.tliseProject.pojo.Emp;
import com.qihe.tliseProject.pojo.PageBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
    /*
    * 查询总记录数
    * */
//    Long count();
/*
* 查询员工信息
*
* ,
* */
  /*  List<Emp> listEmp( Integer start, Integer pageSize,String name, Short gender, LocalDate begin
            , LocalDate end);*/
    List<Emp> listEmp( String name, Short gender, LocalDate begin
            , LocalDate end);

    void deleteIds(int[] ids);

    void add(Emp emp);

    @Select("select id, username, password, name, gender, image, job," +
            " entrydate, dept_id, create_time, update_time from emp where id=#{id}")
    Emp selectById(Integer id);

    void update(Emp emp);
}
