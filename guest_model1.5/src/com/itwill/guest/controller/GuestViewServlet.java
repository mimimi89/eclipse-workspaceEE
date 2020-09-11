package com.itwill.guest.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

/**
 * Servlet implementation class GuestViewServlet
 */
@WebServlet("/guest_view.do")
public class GuestViewServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath="";
		
		String guest_noStr = request.getParameter("guest_no");
		if(guest_noStr==null||guest_noStr.equals("")){
			//response.sendRedirect("guest_list.jsp");
			forwardPath="redirect:guest_list.do";
		}else {
			try {
			GuestService guestService=new GuestService();
			Guest guest=
					guestService.selectByNo(Integer.parseInt(guest_noStr));
			request.setAttribute("guest", guest);
			forwardPath="forward:/WEB-INF/views/guest_view.jsp";
			/*
			if(guest==null){
				out.println("<script>");
				out.println("alert('존재하지않는 게시물입니다');");
				out.println("history.back();");
				out.println("</script>");
				return;
			}
			*/
			}catch (Exception e) {
				e.printStackTrace();
				forwardPath="forward:guest_error.jsp";
			}
			
		}
		String [] pathArray = forwardPath.split(":");
		String forwardOrRedirect=pathArray[0];
		String path=pathArray[1];
	
		if(forwardOrRedirect.equals("redirect")) {
			response.sendRedirect(path);
		}else {
			RequestDispatcher rd=request.getRequestDispatcher(path);
			rd.forward(request, response);
		}
	}

}
