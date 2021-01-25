package cogent.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessagingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingExampleApplication.class, args);
		OutgoingMailExample outbox = new OutgoingMailExample();
		String destination = "awsmirandabrawner@gmail.com";
		String textSubject = "Simple Message";
		String textBody = "This is a message send through Spring";
		// outbox.sendText(destination, textSubject, textBody);
		String attachmentPath = "src/main/resources/static/attachmentExample.txt";
		String attachSubject = "Message With Attachment";
		String attachText = "This message has an attachment";
		// outbox.sendAttachment(destination, attachSubject, attachText, attachmentPath);
	}

}
