package com.app.consumer;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.model.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeConsumer {

	@Autowired
	private DiscoveryClient client;
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/info")
	public String info() {
		return "from Model Prod:"+port;
	}
	@GetMapping("/one")
	public Employee getObject() {
		return new Employee(10, "MR1", "IT",3695.56);
	}
	@GetMapping("/all")
	public List<Employee> getAll() {
		return Arrays.asList(
				new Employee(10, "MR1", "IT",3695.56),
				new Employee(11, "MR2", "BD",2695.56),
				new Employee(12, "MR3", "SUPPORT",1695.56)
				);
	}
	
	
	@GetMapping("/consume")
	public String consumeData() {
		RestTemplate rt=new RestTemplate();
		List<ServiceInstance> list=client.getInstances("EMP-PROVIDER");
		ResponseEntity<String> resp=rt.getForEntity(list.get(0).getUri()+"/emp/show", String.class);
		return "From Consumer ==::== "+resp.getBody();
	}
}
