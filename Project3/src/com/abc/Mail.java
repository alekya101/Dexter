package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.session.mailserver;

/**
 * Servlet implementation class Mail
 */
@WebServlet("/Mail")
public class Mail extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String toEmail=request.getParameter("email");
		//pw.print(to);
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		String fromEmail="alekya101@gmail.com";
		String username="alekya101@gmail.com";
		String password="iluvdadsismom";
		/*try
		{
			pw.print("<!DOCTYPE html>");
			pw.print("<html>");
			pw.print("<head>");
			pw.print("<title>Servlet</title>");
			pw.print("</head>");
			pw.print("<body>");
			pw.print("<b>Mail Sent Successfully</b>");
			pw.print("Click <a href=email.html>here </a>to go back");
			pw.print("</body>");
			pw.print("</html>");
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}*/
		pw.print("mail sent successfully");
		mailserver.sendEmail(fromEmail,username,password,toEmail,subject,message);
	}

}
