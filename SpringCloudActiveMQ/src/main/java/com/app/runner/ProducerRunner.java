package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
@Component
public class ProducerRunner implements CommandLineRunner {

	@Autowired
	private JmsTemplate jt;
	
	
	@Override
	public void run(String... args) throws Exception {
		jt.send("my-topic1", (s)->s.createTextMessage("This is my group message 1.."));
	}

}
