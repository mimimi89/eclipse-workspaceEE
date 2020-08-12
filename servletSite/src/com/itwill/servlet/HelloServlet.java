package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 1. HttpServlet 상속
 */
public class HelloServlet extends HttpServlet{
	/*
	 * 2. service method 재정의
	 */
	@Override
	public void service(HttpServletRequest request, 
						HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 2-1. response header 중 하나인 ContentType 설정
		 */
		response.setContentType("text/html;charset=UTF-8");
		
		
		/*
		 * 2-2. client(web browser)로 전송할 스트림 생성
		 */
		PrintWriter out=response.getWriter();
		
		
		/*
		 * 2-3. client(web browser)로 데이타 출력
		 */
		for (int i=0;i<100;i++) {
			out.println("<h3>HelloServlet"+(i+1)+"[Servlet]!!!</h3><hr>");
			
		}
		
		
		
	}
	
	

}
