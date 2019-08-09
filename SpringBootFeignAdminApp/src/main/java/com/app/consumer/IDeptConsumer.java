package com.app.consumer;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.model.Dept;

@FeignClient("DEPT-APP")
public interface IDeptConsumer {

	@GetMapping("/dept/getdept/{deptid}")
	public Dept getDeptById(@PathVariable("deptid") Integer id); 
	@GetMapping("/dept/getalldept")
	public List<Dept> getAll();
}
