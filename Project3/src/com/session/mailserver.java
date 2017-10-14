package com.session;


import java.util.Properties;

//import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class mailserver {
	 public  static void sendEmail(String fromEmail,String username,String password,String toEmail,String subject,String message)
	 {
		 Properties props = new Properties(); 
		 props.put("mail.smtp.host", "smtp.gmail.com");    
         props.put("mail.smtp.socketFactory.port", "465");    
         props.put("mail.smtp.socketFactory.class",    
                   "javax.net.ssl.SSLSocketFactory");    
         props.put("mail.smtp.auth", "true");    
         props.put("mail.smtp.port", "465");  
        // Session session = Session.getDefaultInstance(props);
         
         Session session = Session.getDefaultInstance(props,    
  	           new javax.mail.Authenticator() {    
  	           protected PasswordAuthentication getPasswordAuthentication() {    
  	           return new PasswordAuthentication(username,password);  
  	           }    
  	          });   
         try {    
	           MimeMessage message1 = new MimeMessage(session);   
	           message1.setFrom(new InternetAddress(fromEmail));
	           message1.setRecipient(Message.RecipientType.TO,new InternetAddress(toEmail));    
	           message1.setContent(message,"text/html");    
	           message1.setSubject(subject);    
	           //send message  
	          // Transport transport=session.getTransport("smtp"); 
	           //transport.connect("smtp.gmail.com",username,password);
	           //Transport.send(message1,message1.getAllRecipients());  
	           Transport.send(message1);
	           System.out.println("message sent successfully");    
	          } 
         catch (MessagingException e) 
         {
        	 throw new RuntimeException(e);
        	 }    
	             
	    }  
	}  
	 

    


