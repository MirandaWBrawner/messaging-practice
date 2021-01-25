package cogent.tutorial.model;

import org.springframework.stereotype.Component;

@Component
public class MessageExample {
	private String recipient;
	private String subject;
	private String text;
	
	public MessageExample() {}

	public MessageExample(String recipient, String subject, String text) {
		this.recipient = recipient;
		this.subject = subject;
		this.text = text;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
