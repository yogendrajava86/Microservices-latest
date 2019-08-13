package com.app.rest;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/cust")
public class CustomerRestController {

	@GetMapping("/show")
	@HystrixCommand(fallbackMethod = "showDataFallbackMethod")
	public String showData() {
		System.out.println("From Actual Service");
		if(new Random().nextInt(15)<=10) {
			throw new RuntimeException("Dummy");
			
		}
		return "Hello Customer";
	}
	
	public String showDataFallbackMethod() {
		System.out.println("From Fallback Method");
		return "Hello From Fallback";
	}
}
