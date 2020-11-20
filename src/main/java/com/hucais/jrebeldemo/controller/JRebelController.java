package com.hucais.jrebeldemo.controller;

import com.hucais.jrebeldemo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试jrebel")
@RestController
public class JRebelController {

    @ApiOperation("测试")
    @GetMapping("/testJRebel/{id}")
    public User findById(@PathVariable Long id) {
        return new User("bbb", 21, "上海", "aaa@bbb.com");
    }

}


