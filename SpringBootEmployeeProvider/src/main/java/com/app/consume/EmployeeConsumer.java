package com.app.consume;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class EmployeeConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	public String getShow() {
		// choose serviceId based on SID
		ServiceInstance sid=client.choose("EMP-CONSUMER");
		//read URI from SI
		URI uri=sid.getUri();
		//construct URL
		String URL=uri+"/emp/one";
		//make HTP request
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> resp=rt.getForEntity(URL, String.class);
		String rs=resp.getBody();
		
		return rs;
	}
	
}
