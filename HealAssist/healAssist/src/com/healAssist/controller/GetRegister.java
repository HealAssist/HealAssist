package com.healAssist.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healAssist.connection.DBConnection;
import com.healAssist.beans.UserDetails;

/**
 * Servlet implementation class GetRegister
 */
@WebServlet("/GetRegister")
public class GetRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");;
		PrintWriter out = response.getWriter();
		out.append("Accessed GET!");
		out.flush();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Entered into doPOst");
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String fullname = request.getParameter("fullname");
	String email = request.getParameter("email");
	String phone = request.getParameter("phone");
	String gender = request.getParameter("gender");
	String 	age = request.getParameter("age");
	String 	address = request.getParameter("address");
	String city =request.getParameter("city");
	String country =request.getParameter("country");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String userType = request.getParameter("userType");
	UserDetails e = new UserDetails();
	e.setFullName(fullname);
	e.setUserEmail(email);
	e.setUserPhone(phone);
	e.setGender(gender);
	e.setAge(age);
	e.setAddress(address);
	e.setCity(city);
	e.setCountry(country);
	e.setUserName(username);
	e.setPassword(password);
	e.setUserType(userType);
	if (e.InsertUser()) {
		System.out.println("user added");
		response.setContentType("text/html");

	      // New location to be redirected
	      String site = new String("http://localhost:8090/healAssist/hospital_project/files/pages/login_soft.html");

	      response.setStatus(response.SC_MOVED_PERMANENTLY);
	      response.setHeader("Location", site);    
	}
	else{
		System.out.println("Failed");
	}
	
}
}
