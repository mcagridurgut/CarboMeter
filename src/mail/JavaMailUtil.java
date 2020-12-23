package mail;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMailUtil {
	public static void sendMail(String recipient, String userPassword) throws Exception {
		System.out.println("Preparing to send email");
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		
		final String myAccountEmail = "carbometerapp@gmail.com";
		final String password = Password.password;
		
		Session session = Session.getInstance(properties, new Authenticator(){
			@Override 
			protected PasswordAuthentication  getPasswordAuthentication() {
				return new PasswordAuthentication (myAccountEmail, password);								
			}						
		});
		
		Message message = prepareMessage(session, myAccountEmail, userPassword, recipient);
		
		Transport.send(message);
		System.out.println("Message sent successfully.");
	}
	
	private static Message prepareMessage(Session session, String myAccountEmail, String userPassword, String recipient) {
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
			message.setSubject("Carbometer forget password");
			message.setText("Your password is: "+ userPassword );
			return message;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}	
}
