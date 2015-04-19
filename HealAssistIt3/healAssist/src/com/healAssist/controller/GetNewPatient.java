package com.healAssist.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healAssist.beans.CaseDetails;
import com.healAssist.beans.CourseDetails;
import com.healAssist.beans.PrescriptionDetails;
import com.healAssist.beans.TabletDetails;
import com.healAssist.beans.UserDetails;

/**
 * Servlet implementation class GetNewPatient
 */
@WebServlet("/GetNewPatient")
public class GetNewPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Entered into doPOst");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fullname = request.getParameter("fullName");
		String email = request.getParameter("email");
		String phone = request.getParameter("phoneNo");
		String gender = request.getParameter("gender");
		String 	age = request.getParameter("age");
		String 	address = request.getParameter("address");
		String city =request.getParameter("cityTown");
		String country =request.getParameter("country");
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		String userType = "1";
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
		System.out.println("helo in getnewPatient");
		CaseDetails caseD;
		PrescriptionDetails pres;
		CourseDetails course;
		TabletDetails td = new TabletDetails();
		//SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		//String fromDate = "19/05/2009";
		//DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		int casesCount = Integer.parseInt(request.getParameter("casesCount"));
		System.out.println("Cases COunt"+casesCount);
		for(int caseNum=1;caseNum<=casesCount;caseNum++)
		{
			System.out.println("In Cases");
			caseD = new CaseDetails();
			caseD.setCaseDate(request.getParameter("case-date_"+caseNum));
			caseD.setCaseTitle(request.getParameter("case-title_"+caseNum));
			caseD.setDoctorId(request.getParameter("doctor_"+caseNum));
			caseD.setCaseInfo(request.getParameter("case-info_"+caseNum));	
			

			int presCount= Integer.parseInt(request.getParameter("prescriptionCount_"+caseNum));
			System.out.println("Pres Count"+caseNum+"--"+presCount);
			for(int presNum = 1; presNum <= presCount; presNum++){
				pres = new PrescriptionDetails();
				pres.setPrescriptioDate(request.getParameter("prescription-date_"+caseNum+"-"+presNum));
				pres.setPrescriptionRemarks(request.getParameter("prescription-remarks_"+caseNum+"-"+presNum));
				
				int coursesCount= Integer.parseInt(request.getParameter("coursesCount_"+caseNum+"-"+presNum));
				System.out.println("Courses Count"+caseNum+"--"+presNum+"--"+coursesCount);
				for(int courseNum = 1; courseNum <= coursesCount; courseNum++){
					course = new CourseDetails();
					course.setTabletId(request.getParameter("tablet_"+caseNum+"-"+presNum+"-"+courseNum));
					course.setNoOfTimesDay(request.getParameter("noOfTimes_"+caseNum+"-"+presNum+"-"+courseNum));
					course.setStartDate(request.getParameter("startDate_"+caseNum+"-"+presNum+"-"+courseNum));
					course.setEndDate(request.getParameter("endDate_"+caseNum+"-"+presNum+"-"+courseNum));
					pres.getCourses().add(course);
				}
				caseD.getPrescriptions().add(pres);
			}
			e.getCases().add(caseD);
		}
		
		
		
		
		if (e.InsertUser()) {
			System.out.println("user added");
			response.setContentType("text/html");

		      // New location to be redirected
		      String site = new String("http://localhost:8090/healAssist/hospital_project/files/pages/newPatient.jsp");

		      response.setStatus(response.SC_MOVED_PERMANENTLY);
		      response.setHeader("Location", site);    
		}
		else{
			System.out.println("Failed");
		}
		
	}
	}


