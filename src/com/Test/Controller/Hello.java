package com.Test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	@RequestMapping("/helloworld")
	public String Hello(){
		System.out.println("success");
		return "success";
	}
}
