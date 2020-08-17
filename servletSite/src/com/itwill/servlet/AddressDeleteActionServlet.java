package com.itwill.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.AddressService;

/**
 * Servlet implementation class AddressDeleteActionServlet
 */
@WebServlet("/address_delete_action.do")
public class AddressDeleteActionServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
				/*
				 * 0.요청객체 encoding설정
				 * 1.파라메타 바끼
				 * 2.AddressService객체생성
				 * 3.AddressService.delete()메쏘드실행
				 * 4.adress_list.do로 redirection
				 요청URL==>
				 http://192.168.15.31/servletSite/address_delete_action.do?no=1
				 */
				request.setCharacterEncoding("UTF-8");
				String noStr=request.getParameter("no");
				if(noStr==null|| noStr.equals("")) {
					response.sendRedirect("address_main.html");
					return;
				}
				AddressService addressSevice=new AddressService();
				int deleteRowCount=
						addressSevice.delete(Integer.parseInt(noStr));
				response.sendRedirect("address_list.do");
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}






