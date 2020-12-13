package com.pro.controller;

import com.pro.entity.res.ResponseBean;
import com.pro.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @RequestMapping("getAllUser")
    public ResponseBean getAllUser() {

        return ResponseBean.builder()
                .code(200)
                .data("123")
                .message("获取用户成功").build();
    }
}
