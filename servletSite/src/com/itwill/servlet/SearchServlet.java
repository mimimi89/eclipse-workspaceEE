package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search.do")
public class SearchServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, 
						   HttpServletResponse response) throws ServletException, IOException {
		/*
		 http://192.168.15.10/servletSite/search.do?searchKeyword=java
		 */
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		/*
		 * 1. 파라메타 받기
		 */
		String searchKeyword=request.getParameter("searchKeyword");
		if(searchKeyword==null || searchKeyword.equals("")) {
			out.println("Oooooops!!! 검색어를 입력하셔야 합니다.<hr>");
			out.println("<a href='http://192.168.15.10/servletSite/05-00.search_form.html'>검색페이지</a>");
			return;
		}
		
		/*
		 * 2. 업무 실행
		 */
		
		
		
		/*
		 * 3. 검색 결과 응답
		 */
		out.println("<h1>"+searchKeyword+"검색결과</h1><hr>");
		out.println("<ol>");
		
		for(int i=0; i<10; i++) {
			out.println("<li>"+searchKeyword+"검색데이타</li>");
		}
		out.println("</ol>");
		
		out.println("<a href='http://192.168.15.10/servletSite/05-00.search_form.html'>검색페이지</a>");

		
	}

}
