package com.hucais.jrebeldemo.controller;

import com.hucais.jrebeldemo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "jrebel")
@RestController
public class JRebelController {

    @ApiOperation("testJrebel")
    @GetMapping("/testJRebel/{id}")
    public User findById(@PathVariable Long id) {
        return new User("bbb", 21, "上海", "aaa@bbb.com");
    }


    @ApiOperation("testJrebel3333")
    @GetMapping("/testJRebel3333333")
    public Integer findById33333(@RequestParam("id3333333333") Integer id3333333333) {
        return id3333333333;
    }

    @ApiOperation("testJRebel44444444")
    @GetMapping("/testJRebel44444444")
    public Integer testJRebel44444444(@RequestParam("id44444444444") Integer id44444444444) {
        return id44444444444;
    }

}


