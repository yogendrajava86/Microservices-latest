package com.app.controller.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Dept;

@RestController
@RequestMapping("/dept")
public class DeptRestController {
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/getdept/{deptid}")
	public Dept getDeptById(@PathVariable("deptid") Integer id) {
		Dept d=new Dept();
		if(id==1) {
			d.setDeptId(id);
			d.setDeptCode("DEV :"+port);
		}
		if(id==2) {
			d.setDeptId(id);
			d.setDeptCode("SUPPORT :"+port);
		}
		if(id==3) {
			d.setDeptId(id);
			d.setDeptCode("BD "+port);
		}
		
		return d;
	}
	
	@GetMapping("/getalldept")
	public List<Dept> getAll() {
		
		List<Dept> list=Arrays.asList(
				new Dept(1,"DEV :"+port),
				new Dept(2,"SUPPORT :"+port),
				new Dept(3,"BD :"+port)
				);
		return list;
	}
}
