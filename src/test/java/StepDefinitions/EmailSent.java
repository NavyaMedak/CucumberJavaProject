package StepDefinitions;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSent {

	public static void main(String[] args) throws EmailException {
		
		
		System.out.println("Test Started");	
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("shivva.navya@gmail.com", "Medak@123"));
		email.setSSLOnConnect(true);
		email.setFrom("shivva.navya@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("naresh.kumarshivva1989@gmail.com");
		email.send();
		System.out.println("===Email Sent=======");	
	
	}

}
