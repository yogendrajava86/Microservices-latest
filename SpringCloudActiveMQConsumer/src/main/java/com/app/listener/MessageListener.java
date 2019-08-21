package com.app.listener;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

	@JmsListener(destination="my-topic1")
	public void readMessage(Message m) {
		TextMessage tm=(TextMessage) m;
		try {
			System.out.println("From Consumer :"+ tm.getText());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
