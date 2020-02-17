package br.com.tarz.jmsqueue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class JmsController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@GetMapping()
	public String JsmTesteController() {
		jmsTemplate.convertAndSend("myDestination", "{user: 'wolmir', usando: 'fila'}");
		return null;
	}
}
