package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddressInsertActionServlet
 */
@WebServlet("/address_insert_action.do")
public class AddressInsertActionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
						 HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("address_insert_form.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
						  HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * 1.파라메타 받기
		 */
		String id=request.getParameter("id");
		
		
		/*
		 * 2.AddressService 객체 생성
		 */
		
		
		/*
		 * 3. 파라메타 데이타로 Address 객체 생성
		 */
		
		
		/*
		 * 4. AddressService.create() 메쏘드 실행
		 */
		
		/*
		 * 5. Address_list.do로 redirection
		 */
		
	}

}
