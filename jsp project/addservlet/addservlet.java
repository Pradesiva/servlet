package com.demoservlet1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	 {
		 int a=Integer.parseInt(req.getParameter("t1"));
		 int b=Integer.parseInt(req.getParameter("t2"));
		
		System.out.println("the ans is"+a);
		PrintWriter ptr=null;
		try {
			ptr=res.getWriter();
			
		}
		catch(IOException e)
		{
			System.out.println("the anss is ...."+(a+b));
		}
		ptr.write("the ress is:"+(a+b));
		
		
		
		 
	 }
	

}
