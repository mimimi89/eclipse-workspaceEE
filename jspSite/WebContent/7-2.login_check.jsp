<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String loginId=(String)session.getAttribute("loginId");
	if(loginId==null){
		response.sendRedirect("7-2.default_session_login_form.jsp");
		return;
	}
%>