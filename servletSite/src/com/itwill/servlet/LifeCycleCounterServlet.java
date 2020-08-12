package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*

<servlet> 
<servlet-name>lifecyclecounter</servlet-name>
<servlet-class>com.itwill.servlet.LifeCycleCounterServlet</servlet-class>
</servlet>

<servlet-mapping>
<servlet-name>lifecyclecounter</servlet-name>
<url-pattern>/lifecycle.do</url-pattern>
<url-pattern>/lifecycle.html</url-pattern>
<url-pattern>/lifecycle.nhn</url-pattern>
<url-pattern>/lifecycle</url-pattern>
</servlet-mapping>

*/
@WebServlet(name = "lifecyclecounter", 
			urlPatterns = {"/lifecycle.do", "/lifecycle.html", "/lifecycle"})
//@WebServlet("/lifecycle")
public class LifeCycleCounterServlet extends HttpServlet {
	
	int count;
   
	public LifeCycleCounterServlet() {
		System.out.println("0.LifeCycleCounterServlet 기본생성자 호출 --> 객체가 만들어짐 "+this);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("1.init() 생성자 호출 직후에 단 한 번 호출[객체 초기화, 리소스 획득]");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("3.destroy() 객체가 메모리(힙 영역)에서 해제될 때 호출[리소스 해지]");
	}
	
	protected void service(HttpServletRequest request, 
						   HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("2.service() 요청시마다 호출 --> 요청 IP: "+request.getRemoteAddr());
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out=response.getWriter();
		
		out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body bgcolor=#40e0d0 style=\"font-size: 9pt; line-height: 140%;\">");
		out.println("	<center>");
		count++;
		out.println("		현재까지의 페이지뷰수[요청횟수] <font color=#0000FF> "+count+" </font> 번입니다");
		out.println("	</center>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
