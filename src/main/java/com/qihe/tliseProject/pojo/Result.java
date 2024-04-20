package com.qihe.tliseProject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    //1表成功,0表失败
    private Integer code;
    //提示信息
    private String msg;
    //数据
    private Object data;


    public static Result Success(Object data){
        return new Result(1,"success",data);
    }
    public static Result Success(){
        return new Result(1,"success",null);
    }
    public static Result error(String msg){
        return new Result(0,msg,null);
    }


}
