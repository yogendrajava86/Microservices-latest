package com.app.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
@RefreshScope
public class CartRestController {
	@Value("${my.demo:testExceptionHandle}")
	private String myDemo;
	
	@GetMapping("/show")
	public String showData() {
		return "From Cart APP- Hello : "+myDemo;
	}

}
