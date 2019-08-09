package com.app.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.consumer.IDeptConsumer;

@RestController
@RequestMapping("/admin")
public class AdminRestController {
	@Autowired
	private IDeptConsumer service;

	@GetMapping("/getdpt/{deptid}")
	public String getDept(@PathVariable("deptid") Integer id) {
		String entity=service.getDeptById(id).toString();
		
		
		return "From Admin : "+entity;
	}
	@GetMapping("/getalldpt")
	public String getAllDept() {
		String entity=service.getAll().toString();
		
		
		return "From Admin : "+entity;
	}
}
