package com.testProject.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@RequestMapping("/home")
	@ResponseBody
	public String Hello()
	{
		return "hello";
	}
	
	@RequestMapping("/welcome")
	public String Welcome()
	{
		return "welcomePage";
	}
}
