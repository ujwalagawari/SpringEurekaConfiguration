package com.cg.configurationclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/messages")
public class MessageRestController {
	/*
	 * @Value("${message:default}") private String message;
	 * 
	 * @RequestMapping("/message") String getMessage() { return this.message; }
	 */
	
	@GetMapping
	public String msg() {
		return "Hello World !!!";
	}
	

}
