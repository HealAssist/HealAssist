<%@page import="com.healAssist.connection.DBConnection"%>
<%@page import="com.healAssist.DAO.CaseDetailsDAO"%>
<%@page import="com.healAssist.beans.CaseDetails"%>
<%@page import="com.healAssist.DAO.UserDetailsDAO"%>
<%@page import="com.healAssist.beans.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
</head>
<body><h1 align="center">User Profile</h1>
<%

String userid = session.getAttribute("user_id").toString();

UserDetails c1= new UserDetailsDAO().BusinessLogic(userid);

CaseDetails c2 = new CaseDetailsDAO().BusinessLogic(userid);


%>
<table align="center">

<tr>
<td>
User Name :</td><td><%=c1.getUserName() %></td></tr>
<tr>
<td>
User Email :</td><td> <%=c1.getUserEmail() %></td></tr>

<tr>
<td>
User Phone :</td><td> <%=c1.getUserPhone() %> </td></tr>

<tr>
<td>
User Address :</td><td> <%=c1.getAddress()%></td></tr>

<tr>

<select name="Id">
                        <option>---------------------</option>
                        
                             </select>
        

</table>
</body>
</body>

</html>