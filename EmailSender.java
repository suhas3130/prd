import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EmailSender {
	public static void send(String customerEmail, String subject, String content) throws AddressException, MessagingException {
		Properties prop = new Properties();

		prop.put("mail.smtp.auth", true);

		prop.put("mail.smtp.starttls.enable", "true");

		prop.put("mail.smtp.host", "smtp.gmail.com");

		prop.put("mail.smtp.port", "587");

		prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		//Authentication
		Session session = Session.getInstance(prop, new Authenticator() {

		    @Override

		    protected PasswordAuthentication getPasswordAuthentication() {

		        return new PasswordAuthentication("apisuhasrao@gmail.com", "fiddling3130");

		    }

		});

		   

		  Message message = new MimeMessage(session);

		  message.setFrom(new InternetAddress("apisuhasrao@gmail.com"));
		  message.setRecipients(

		   Message.RecipientType.TO, InternetAddress.parse(customerEmail));

		   
		  message.setSubject(subject);


		  String msg = content;


		  MimeBodyPart mimeBodyPart = new MimeBodyPart();

		  mimeBodyPart.setContent(msg, "text/html");


		  Multipart multipart = new MimeMultipart();

		  multipart.addBodyPart(mimeBodyPart);


		  message.setContent(multipart);


		  Transport.send(message);
	}
	
}
