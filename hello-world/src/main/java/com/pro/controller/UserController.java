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

}
