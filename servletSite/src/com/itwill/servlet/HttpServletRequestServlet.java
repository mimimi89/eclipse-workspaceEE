//124페이지 질의문자열
package com.itwill.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletRequestServlet
 */
@WebServlet("/request.do")
public class HttpServletRequestServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, 
						   HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HttpServletRequestServlet.service()");
		
		/*
		http://192.168.15.10/servletSite/request.do?name=kim&address=LA
		 */
		
		String queryString=request.getQueryString();
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String phone=request.getParameter("phone");
		
		String contextPath=request.getContextPath();
		String requestURL=request.getRequestURL().toString();
		String requestURI=request.getRequestURI();
		String remoteAddress=request.getRemoteAddr();
		InputStream in=request.getInputStream();
		
		System.out.println("--------------파라메타---------------");
		System.out.println("query string: "+queryString);
		System.out.println("name parameter: "+name);
		System.out.println("address parameter: "+address);
		System.out.println("phone parameter: "+phone);
		System.out.println("contextPath: "+contextPath);
		System.out.println("requestURL: "+requestURL);
		System.out.println("requestURI: "+requestURI);
		System.out.println("remoteAddress: "+remoteAddress);
		System.out.println("InputStream: "+in);
		System.out.println("-----------------------------");
		/*
		 * 클라이언트 출력하려면 system 없애고 servlet..
		 */
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out=response.getWriter();
		
		out.println("query string: "+queryString);
		out.println("name parameter: "+name);
		out.println("address parameter: "+address);
		out.println("phone parameter: "+phone);
		System.out.println("-----------------------------");
		out.println("contextPath: "+contextPath);
		out.println("requestURL: "+requestURL);
		out.println("requestURI: "+requestURI);
		out.println("remoteAddress: "+remoteAddress);
		out.println("InputStream: "+in);
	}

}
