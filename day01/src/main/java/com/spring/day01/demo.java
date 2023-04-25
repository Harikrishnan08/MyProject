package com.spring.day01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demo {
	@RequestMapping("/")
	@ResponseBody
	public String display()
	{
		return"hari";
	}

}
