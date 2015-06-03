package week1exercise.day2;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendMail
{
   public static void main(String [] args)
   {    
      // Recipient's email ID needs to be mentioned.
      String to = "kpmhuruyengwe@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "motlhodi@gmail.com";

      // Assuming you are sending email from localhost
      String host = "localhost";

      // Get system properties
      Properties properties = System.getProperties();
      // Setup mail server
      properties.setProperty("mail.smtp.host", host);
      
      properties.put("mail.transport.protocol", "smtp");
      properties.put("mail.smtp.starttls.enable", "true"); 
      properties.put("mail.smtp.host", "smtp.gmail.com");
      //properties.put("mail.smtp.user", "motlhodi@gmail.com"); 
      //properties.put("mail.smtp.password", "mymail2014"); 
      properties.put("mail.smtp.port", 25);
      properties.put("mail.smtp.socketFactory.port", 25);  
      properties.put("mail.smtp.auth", "true");
      

      // Get the default Session object.
      Session session = Session.getDefaultInstance(properties, new GMailAuthenticator("motlhodi@gmail.com", "mymail2014" ));

      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("Java Rocks!");

         // Now set the actual message
         message.setText("I sent this from my IDE");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}
