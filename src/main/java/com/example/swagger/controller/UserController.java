package com.example.swagger.controller;

import com.example.swagger.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api("UserController")
@RestController
@RequestMapping(value="/user")
public class UserController {

    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "获取用户信息",notes = "根据用户ID获取用户信息")
    @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "User")
    public String getUserInfo(@RequestBody User user){
        return "success";
    }
    @RequestMapping(value = "/getUserList/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取用户信息列表",notes = "根据用户ID获取用户信息列表")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Int")
    public String getUserList(@PathVariable Integer id){
        return "success";
    }
    @RequestMapping(value = "/getUser",method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value = "获取用户",notes = "根据用户ID获取用户信息")
    @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "User")
    public String getUser(@RequestBody User user){
        return "success";
    }
}
