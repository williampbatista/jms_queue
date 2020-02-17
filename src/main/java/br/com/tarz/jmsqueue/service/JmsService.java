package br.com.tarz.jmsqueue.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsService {

	@JmsListener(destination = "myDestination")
	public void JmsTeste(String str) {
		System.out.println("JSM QUEUE WORKS! "+str);
	}
	
}
