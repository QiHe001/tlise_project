package com.qihe.tliseProject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    //id
    private Integer id;
    //用户名
    private String username;
    //密码
    private String password;
    //姓名
    private  String name;
    //性别 1：男  2：女
    private Short gender;
    //照片
    private String image;
    //对应工作号
    private Short job;
    //入职日期
    private LocalDate entrydate;
    //部门id
    private Short deptId;
    //创造时间
    private LocalDateTime createTime;
    //更新时间
    private LocalDateTime updateTime;

}

