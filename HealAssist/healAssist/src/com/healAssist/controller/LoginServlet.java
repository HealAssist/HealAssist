package com.healAssist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.healAssist.beans.UserDetails;
import com.healAssist.DAO.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("in login servlet");

		UserDetails cb = new UserDetails();
		cb.setUserName(request.getParameter("username"));
		cb.setPassword(request.getParameter("password"));

		response.setContentType("text/html");
		LoginDAO loginExecute = new LoginDAO();

		HttpSession session = request.getSession();
		int res = loginExecute.ValidLogin(cb);
		
        if(res==1){
        	
		session.setAttribute("user_name", cb.getUserName());
		
		System.out.println(session.getAttribute("user_type"));

		response.getWriter().print("{'success':true}");
		System.out.println("user LOGIN ");
		response.setContentType("text/html");

	      // New location to be redirected
	      String site = new String("http://localhost:8081/healAssist/hospital_project/files/pages/newPatient.html");

	      response.setStatus(response.SC_MOVED_PERMANENTLY);
	      response.setHeader("Location", site);
        }
        else
        {
        	response.setContentType("text/html");

  	      // New location to be redirected
  	      String site = new String("http://localhost:8081/healAssist/hospital_project/files/pages/login_soft.html");

  	      response.setStatus(response.SC_MOVED_PERMANENTLY);
  	      response.setHeader("Location", site);
	}

}
}
