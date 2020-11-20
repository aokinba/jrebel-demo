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

@Api(tags = "用户管理")
@RestController("test")
public class UserController {
    @ApiOperation("创建用户")
    @PostMapping("/users")
    public User create(@RequestBody @Validated User user) {
        return user;
    }



    @ApiOperation("用户详情22222222222222")
    @GetMapping("/users22/{id}")
    public User findById22(@PathVariable Long id) {
        return new User("bbb", 21, "上海", "aaa@bbb.com");
    }


    @ApiOperation("用户列表")
    @GetMapping("/users")
    public List<User> list(@ApiParam("查看第几页") @RequestParam int pageIndex,
                           @ApiParam("每页多少条") @RequestParam int pageSize) {
        List<User> result = new ArrayList<>();
        result.add(new User("aaa", 50, "北京2222", "aaa@ccc.com"));
        result.add(new User("bbb", 21, "广州2222", "aaa@ddd.com"));
        return result;
    }

    @ApiIgnore
    @DeleteMapping("/users/{id}")
    public String deleteById(@PathVariable Long id) {
        return "delete user : " + id;
    }
}


