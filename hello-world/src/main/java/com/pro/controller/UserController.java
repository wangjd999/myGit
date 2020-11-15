package com.pro.controller;

import com.pro.entity.User;
import com.pro.entity.res.RequestBean;
import com.pro.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/11/15 14:11
 * @Description:
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getAllUser")
    public RequestBean getAllUser(){
        List<User> allUser = userService.getAllUser();
        return RequestBean.builder()
                .code("200")
                .message("查询成功")
                .data(allUser)
                .build();
    }
}
