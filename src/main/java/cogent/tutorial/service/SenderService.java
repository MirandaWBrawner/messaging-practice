package cogent.tutorial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import cogent.tutorial.model.MessageExample;

@Service
public class SenderService {
	
	private JavaMailSender sender;
	
	/*
	public SenderService() {
		sender = new JavaMailSenderImpl();
	} */
	
	@Autowired
	public SenderService(JavaMailSender sender) {
		this.sender = sender;
	}
	
	public void send(MessageExample messageExample) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(messageExample.getRecipient());
		message.setSubject(messageExample.getSubject());
		message.setText(messageExample.getText());
		sender.send(message);
	}

}
