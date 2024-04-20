package com.qihe.tliseProject.pojo;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    int id;
    String name;
    LocalDateTime createTime;
    LocalDateTime updateTime;
}
