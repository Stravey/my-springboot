package com.liu.springboot_rui.controller;

import com.liu.springboot_rui.pojo.dto.UserDto;
import com.liu.springboot_rui.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    //增加
    @PostMapping   //URL:localhost:8080/user
    public String add(@RequestBody UserDto user) {
        userService.add(user);
        return "success";
    }




    //查询


    //删除


    //删除用户



}
