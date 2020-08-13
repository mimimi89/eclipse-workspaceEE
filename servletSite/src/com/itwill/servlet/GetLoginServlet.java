package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetLoginServlet
 */
@WebServlet("/get_login.do")
public class GetLoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
						   HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청방식(method): "+request.getMethod());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		/*
		 * 1. 요청시에 전송되는 파라메타 받기
		 * 		-파라메타 이름은 input element의 name 속성과 일치해야 함
		 * 		<input type="text" name="id">
		 * 		<input type="password" name="pass">
		 */
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
		if(id==null || pass==null || id.equals("") || pass.equals("")) {
			out.println("<h1>아이디, 패스워드를 입력하세요.</h1><hr>");
			out.println("<a href='http://192.168.15.10/servletSite/05-01.login_get.html'>로그인폼[GET]</a>");
			return;
		}
		
		/*
		 * 2. Service의 method 실행(login method)
		 */
		/*
		  id  | pass
		  ---------
		  xxx | 1111
		  yyy | 2222
		 */
		boolean isMember1=id.equals("xxx")&&pass.equals("1111");		
		boolean isMember2=id.equals("yyy")&&pass.equals("2222");		
		
		/*
		 * 3. 클라이언트로 결과 전송
		 */
		out.println("<h1>로그인 결과</h1><hr>");
		if(isMember1||isMember2) {
			//로그인 성공
			out.println("<h3>"+id+"님 로그인 성공</h3><hr>");
			out.println("<a href='index.html'>메인으로</a>");
			
		}else {
			//로그인 실패
			out.println("<h3>"+id+"님 로그인 실패</h3><hr>");
			out.println("<a href='http://192.168.15.10/servletSite/05-01.login_get.html'>다시 로그인</a>");
		}
		
		
	
	}

}
