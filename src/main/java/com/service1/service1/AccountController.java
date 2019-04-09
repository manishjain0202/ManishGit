package com.service1.service1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
@RequestMapping("/service1")	
	public String getService1()
	{
		return "called Service1";
	}

}
