package com.hucais.jrebeldemo.controller;

import com.hucais.jrebeldemo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "用户管理2222")
@RestController("test2222")
public class UserController222 {

    @ApiOperation("用户详情333333")
    @GetMapping("/users222/{id}")
    public User findById(@PathVariable Long id) {
        return new User("bbb", 21, "上海", "aaa@bbb.com");
    }

}


