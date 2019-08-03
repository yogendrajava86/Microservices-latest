package com.app.consumer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/emp")
public class EmployeeConsumer {

	@Autowired
	private DiscoveryClient client;
	
	@GetMapping("/consume")
	public String consumeData() {
		RestTemplate rt=new RestTemplate();
		List<ServiceInstance> list=client.getInstances("EMP-PROVIDER");
		ResponseEntity<String> resp=rt.getForEntity(list.get(0).getUri()+"/emp/show", String.class);
		return "From Consumer ==::== "+resp.getBody();
	}
}
