<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getMethod().equalsIgnoreCase("GET")){
		response.sendRedirect("4.login_post_form.jsp");
		return;
	}
	/*
	 * 1.파라메타바끼
	  	아이디:<input type="text" name="id">
		패에쓰:<input type="password" name="pass">
	 */
	String id=request.getParameter("id");
	String pass=request.getParameter("pass");
	
	/*
	 * 2.업무실행(DB)
	 *  id |pass
	 *  ---------
	 *  xxxx|1111
	 *  yyyy|2222
	 */
	boolean isMember1=id.equals("xxxx") && pass.equals("1111");
	boolean isMember2=id.equals("yyyy") && pass.equals("2222");
	
	/*
	 * 3.클라이언트로 결과전송
	 */
	out.println("<h1>POST로그인결과</h1><hr/>");
	if(isMember1 || isMember2){
		out.println("<h3>"+id+"님 로그인성공</h3>");
		out.println("<a href='1.hello.jsp'>메인으로</a>");
	}else{
		String msg=URLEncoder.encode("아이디패쓰워드확인", "UTF-8");
		response.sendRedirect("4.login_post_form.jsp?msg="+msg);
		/*
		out.println("<h3>"+id+"님 로그인실패</h3>");
		out.println("<a href='4.login_post_form.jsp'>다시로그인</a>");
		*/
	}
%> 







   
