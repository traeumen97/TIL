<%@ page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id="kimseokyung";
	String pwd="1234";
	String name="김서경";
	request.setCharacterEncoding("UTf-8");
	if(id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd")) ) {
		response.sendRedirect("04_main.jsp?name="+URLEncoder.encode(name, "UTF-8"));
	} else {
		response.sendRedirect("04_loginForm.jsp");
	}
 %>
 