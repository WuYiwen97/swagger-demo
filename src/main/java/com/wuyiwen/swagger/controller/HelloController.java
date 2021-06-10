package com.wuyiwen.swagger.controller;

import com.wuyiwen.swagger.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {


    @GetMapping("/test")
    public String hello(){
        return "heool";
    }

    @PostMapping("/user")
    public User user(){
        return new User();
    }

    @ApiOperation("hello控制类")
    @PostMapping("/user2")
    public String use2(@RequestParam("name")String name){
        return "heee"+name;
    }




}
