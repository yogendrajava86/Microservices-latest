package com.app.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.consume.EmployeeConsumer;

@RestController
@RequestMapping("/emp")
public class EmployeeRestController {
	@Autowired
	private EmployeeConsumer eservice;

	@GetMapping("/show")
	public String showMsg() {
		String msg=eservice.getShow();
		return "From Employee Provider: "+msg;
	}
}
