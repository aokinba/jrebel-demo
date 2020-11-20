package com.hucais.jrebeldemo.entity;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author sujinglong
 * @Date 2020/11/16
 * @description todo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户基本信息")
public class User {

    @ApiModelProperty("姓名2222222")
    private String name2222;

    @ApiModelProperty("年龄")
    private Integer age;
    @NotNull
    private String address;

    private String email;
}
