package com.qihe.tliseProject.controller;

import com.qihe.tliseProject.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
@RestController
@Slf4j
public class UploadController {
    @PostMapping ("/upload")
    public Result uplod(@RequestParam("username") String name , Integer age, MultipartFile image){
        log.info("文件上传:{},{},{}",name,age,image);
        return Result.Success();
    }
}
