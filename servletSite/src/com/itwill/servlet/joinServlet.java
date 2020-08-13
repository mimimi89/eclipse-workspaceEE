package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class joinServlet
 */
@WebServlet("/join.do")
public class joinServlet extends HttpServlet {
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		/*******************************************
		  1.요청시에 전송되는 파라메타바끼
		     - 파라메타이름은 input element의 name속성과일치
		      	<input type="text" name="xxx">
		     - join.do?xxx=java
		     - request.getParameter("xxx")
		     
		    << POST방식 파라메타 값 한글인코딩 >>
		      - 요청객체에 문자인코딩설정
		        request.setCharacterEncoding("UTF-8");
		          
		 **************************************************/
		
		/*
		 * 1. 파라메타 받기
		 */	
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
		String repass=request.getParameter("repass");
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		String gender=request.getParameter("gender");
		String job=request.getParameter("job");
		//String hobby=request.getParameter("hobby");
		String[] hobbies=request.getParameterValues("hobby");
		/*
		 * 2. service 객체 메쏘드 호출
		 */		
		
		/*
		 * 3. client에 결과 전송
		 */
		out.println("<table border='1' align='center'>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center' colspan='2'>"+name+"님 가입정보</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center'>아이디</td>");
		out.println("<td style='text-align:center'>"+id+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center'>비밀번호</td>");
		out.println("<td style='text-align:center'>"+repass+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center'>비밀번호확인</td>");
		out.println("<td style='text-align:center'>"+id+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center'>이름</td>");
		out.println("<td style='text-align:center'>"+name+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center'>주소</td>");
		out.println("<td style='text-align:center'>"+addr+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center'>성별</td>");
		out.println("<td style='text-align:center'>"+gender+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td style='text-align:center'>직업</td>");
		out.println("<td style='text-align:center'>"+job+"</td>");
		out.println("</tr>");
		
		/*
		out.println("<tr>");
		out.println("<td style='text-align:center'>취미</td>");
		out.println("<td style='text-align:center'>"+hobby+"</td>");
		out.println("</tr>");
		*/
		
		
		if(hobbies==null) {
			out.println("<tr>");
			out.println("<td style='text-align:center'>취미</td>");
			out.println("<td style='text-align:center'>없음</td>");
			out.println("</tr>");
			
		}else if(hobbies.length==0){
			out.println("<tr>");
			out.println("<td style='text-align:center'>취미</td>");
			out.println("<td style='text-align:center'>"+hobbies[0]+"</td>");
			out.println("</tr>");
			
		}else if(hobbies.length==1) {
		
			
			out.println("<tr>");
			out.println("<td style='text-align:center' rowspan='2'>취미</td>");
			out.println("<td style='text-align:center'>"+hobbies[0]+"</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td style='text-align:center'>"+hobbies[1]+"</td>");
			out.println("</tr>");
			
		}else if(hobbies.length==2) {
			out.println("<tr>");
			out.println("<td style='text-align:center' rowspan='3'>취미</td>");
			out.println("<td style='text-align:center'>"+hobbies[0]+"</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td style='text-align:center'>"+hobbies[1]+"</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td style='text-align:center'>"+hobbies[2]+"</td>");
			out.println("</tr>");
			
		}else if(hobbies.length==3) {
			out.println("<tr>");
			out.println("<td style='text-align:center' rowspan='4'>취미</td>");
			out.println("<td style='text-align:center'>"+hobbies[0]+"</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td style='text-align:center'>"+hobbies[1]+"</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td style='text-align:center'>"+hobbies[2]+"</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td style='text-align:center'>"+hobbies[3]+"</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		
		
	
		
	}

}
