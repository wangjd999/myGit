package com.wjd.controller;

import com.wjd.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjd
 * @since 2020/9/7
 **/
//@RestController
@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello-World111";
	}

    @RequestMapping("/helloThymeleaf")
    public String helloThymeleaf(Model model) {
        model.addAttribute("hello","hello Thymeleaf!");
	    return "index";
    }
}