package com.wjd.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @author wangjd
 * @since 2020/9/7
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldTest {

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() {
//		mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testHello() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello")).andDo(print());
	}
}