package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

/**
 * Servlet implementation class AddressDetailServlet
 */
@WebServlet("/address_detail.do")
public class AddressDetailServlet extends HttpServlet {
	protected void service(HttpServletRequest request, 
						   HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			
			/*
			 http://192.168.15.10/servletSite/address_detail.do?no=45
			 */
			
			/*
			 * 1.파라메타 받기(no)
			 */
			request.setCharacterEncoding("UTF-8");
			String no=request.getParameter("no");
			/*
			String id=request.getParameter("id");
			String name=request.getParameter("name");
			String phone=request.getParameter("phone");
			String address=request.getParameter("address");
			*/

			
			/*
			 * 2.AddressService 객체 생성
			 */
			AddressService as=new AddressService();
			
			/*
			 * 3.받은 파라메타로 AddressService.selectByNo() 메쏘드 실행
			 */
			//Address findAddress = as.selectByNo(no);
			Address findAddress = as.selectByNo(Integer.parseInt(no));
			
			/*
			 * 4. Address 객체 반환 
			 */
			
			int noo=findAddress.getNo();
			String idd=findAddress.getId();
			String namee=findAddress.getName();
			String phonee=findAddress.getPhone();
			String addresss=findAddress.getAddress();
			
			
			/*
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@182.237.126.19:1521:XE", 
						"javapython10",
						"javapython10");
			PreparedStatement pstmt=con.prepareStatement("select * from address where no=?");
			ResultSet rs=pstmt.executeQuery();
			*/
			
			/*
			 * 5. client한테 보여주기
			 */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title>Insert title here</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>["+namee+"님 주소록상세보기]</h1><hr>");
			out.println("<div>");
			out.println("	<a href='address_delete_action.do?no="+noo+"'>"+namee+"님삭제[GET]</a>");
			out.println("	<a href='address_update_form.do'>["+namee+"님 주소록수정폼]</a>");
			out.println("	<a href='address_insert_form.do'>[주소록쓰기폼]</a>");
			out.println("	<a href='address_list.do'>[주소록리스트]</a>");
			out.println("</div>");
			out.println("<p>");
			out.println("	번호:"+noo+"<br>");
			out.println("	아이디:"+idd+"<br>");
			out.println("	이름:"+namee+"<br>");
			out.println("	전화:"+phonee+"<br>");
			out.println("	주소:"+addresss+"<br>");
			out.println("</p>");
			out.println("</body>");
			out.println("</html>");
			/*
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title>Insert title here</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>["+rs.getNString("name")+"님 주소록상세보기]</h1><hr>");
			out.println("<div>");
			out.println("	<a href='address_delete_action.do?no="+rs.getNString("no")+"'>"+rs.getNString("name")+"님삭제[GET]</a>");
			out.println("	<a href='address_update_form.do'>["+rs.getNString("name")+"님 주소록수정폼]</a>");
			out.println("	<a href='address_insert_form.do'>[주소록쓰기폼]</a>");
			out.println("	<a href='address_list.do'>[주소록리스트]</a>");
			out.println("</div>");
			if(rs.next()) {
				out.println("<p>");
				out.println("	번호:"+rs.getNString("no")+"<br>");
				out.println("	아이디:"+rs.getNString("id")+"<br>");
				out.println("	이름:"+rs.getNString("name")+"<br>");
				out.println("	전화:"+rs.getNString("phone")+"<br>");
				out.println("	주소:"+rs.getNString("address")+"<br>");
				out.println("</p>");
				
			}
			out.println("</body>");
			out.println("</html>");
			*/
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

		
		
	}

}
