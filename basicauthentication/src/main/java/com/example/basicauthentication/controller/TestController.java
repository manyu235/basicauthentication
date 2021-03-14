package com.example.basicauthentication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo/v1/")
public class TestController 
{
	@RequestMapping(value = "getname")
	public String getName()
	{
		return "from TestController";
		
	}

}
