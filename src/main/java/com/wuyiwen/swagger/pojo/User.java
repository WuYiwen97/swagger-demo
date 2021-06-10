package com.wuyiwen.swagger.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体")
public class User {

    @ApiModelProperty("名字")
    public String name;
    @ApiModelProperty("密码")
    public String password;
}
