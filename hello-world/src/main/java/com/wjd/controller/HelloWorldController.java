package com.wjd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjd
 * @since 2020/9/7
 **/
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello-World111";
	}
}