package com.healAssist.controller;

import java.io.IOException;
import java.security.MessageDigest;

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
      
	private String md5(String c){
		try{
			MessageDigest digs=MessageDigest.getInstance("MD5");
			digs.update((new String(c).getBytes("UTF8")));
			String str = new String(digs.digest());
			 return str;
		}catch (Exception ex) {
			return "";
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In Login Get");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("in login servlet");

		UserDetails cb = new UserDetails();
		 cb.setUserName(request.getParameter("username"));
		System.out.println(md5(request.getParameter("password")));
		cb.setPassword(md5(request.getParameter("password")));

		response.setContentType("text/html");
		LoginDAO loginExecute = new LoginDAO();

		HttpSession session = request.getSession();
		UserDetails res = loginExecute.ValidUserPwd(cb.getUserName(),cb.getPassword());
		UserDetails result = loginExecute.ValidUserPwdPatient(cb.getUserName(),cb.getPassword());
		
		if(result!=null){
			session.setAttribute("userDetails", result);
			
			
			System.out.println(((UserDetails)session.getAttribute("userDetails")).toString());

			response.getWriter().print("{'success':true}");
			System.out.println("user LOGIN ");
			response.setContentType("text/html");
System.out.println("helo world");
		      // New location to be redirected
		      String site = new String("http://localhost:8090/healAssist/hospital_project/files/pages/viewPatient.jsp");

		      response.setStatus(response.SC_MOVED_PERMANENTLY);
		      response.setHeader("Location", site);
		      return;
		}
		else if(result==null && res==null)
		{
			response.setContentType("text/html");
System.out.println("helo world 2");
	  	      // New location to be redirected
	  	      String site = new String("http://localhost:8090/healAssist/hospital_project/files/pages/login_soft.html");

	  	      response.setStatus(response.SC_MOVED_PERMANENTLY);
	  	      response.setHeader("Location", site);

		}
		
		
        if(res!=null){
        	
		session.setAttribute("userDetails", res);
		System.out.println("helo world 3");

		
		System.out.println(session.getAttribute("userDetails"));

		response.getWriter().print("{'success':true}");
		System.out.println("user LOGIN ");
		response.setContentType("text/html");

	      // New location to be redirected
	      String site = new String("http://localhost:8090/healAssist/hospital_project/files/pages/newPatient.jsp");

	      response.setStatus(response.SC_MOVED_PERMANENTLY);
	      response.setHeader("Location", site);
	      return;
        }
        else if(res==null && result==null)
        {
        	response.setContentType("text/html");
        	System.out.println("helo world 4");

  	      // New location to be redirected
  	      String site = new String("http://localhost:8090/healAssist/hospital_project/files/pages/login_soft.html");

  	      response.setStatus(response.SC_MOVED_PERMANENTLY);
  	      response.setHeader("Location", site);
  	      return;
	}

}
}


