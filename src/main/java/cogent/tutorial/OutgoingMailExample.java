package cogent.tutorial;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.tutorial.model.MessageExample;
import cogent.tutorial.service.SenderService;

@RestController
public class OutgoingMailExample {
	
	@Autowired
	SenderService service;
	
	public OutgoingMailExample() {
		// this.service = new SenderService();
	}
	
	@PostMapping("/sendText")
	public void sendText(String recipient, String subject, String fullText) {
		MessageExample example = new MessageExample(recipient, subject, fullText);
		service.send(example);
	}
	
	public void sendAttachment(String recipient, String subject, String fullText, String attachment) {
		MimeMessage message = sender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			ClassPathResource resource = new ClassPathResource(attachment);
			helper.addAttachment(attachment, resource);
			sender.send(message);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
	
}
