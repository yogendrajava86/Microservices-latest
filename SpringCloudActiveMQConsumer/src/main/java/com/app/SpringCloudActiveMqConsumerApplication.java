package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringCloudActiveMqConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudActiveMqConsumerApplication.class, args);
	}

}
