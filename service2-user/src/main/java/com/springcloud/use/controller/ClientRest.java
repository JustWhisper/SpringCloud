package com.springcloud.use.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ClientRest {
	@RequestMapping("/test")
	public String test()throws IOException{
		return "test2";
	}
}
