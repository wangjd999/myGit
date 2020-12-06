package com.pro.controller;

import com.pro.entity.res.RequestBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangxiaoqiang
 * @Date: 2020/12/6 14:45
 * @Description:
 */

@RestController
public class UserLoginController {

    @RequestMapping("/login_error")
    public RequestBean loginError() {
        return RequestBean.builder().message("登录失败！").build();
    }

    @RequestMapping("/login_success")
    public RequestBean loginSuccess() {
        return RequestBean.builder().message("登录成功！").build();
    }

    @RequestMapping("/login_page")
    public RequestBean loginPage() {
        return RequestBean.builder().message("未登录，请重新登录！").build();
    }
}
