package com.training.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("uname");
		String pass=request.getParameter("pwd");
		
		pw.print(name);
		pw.print(pass);
		if(name.equals("ram")&&pass.equals("ram"))
		{
			pw.print("login success");
			
		}
		else
		{
			pw.print("enter again");
		}
	}
}
