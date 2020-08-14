package com.itwill.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MIMETypeImageResponseServlet
 */
@WebServlet("/response_image.do")
public class MIMETypeImageResponseServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, 
						   HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("image/jpeg");
		OutputStream out=response.getOutputStream();
		
		//이미지 위치를 알기 위한 작업
		ServletContext siteContext=this.getServletContext();
		String contextImagePath=siteContext.getRealPath("/images/album.jpg");
		System.out.println(contextImagePath);
		
		//이미지를 브라우저로 보내는 작업
		FileInputStream fin=new FileInputStream(contextImagePath);
		while(true) {
			int readByte=fin.read();
			if(readByte==-1) break;
			out.write(readByte);
		}
		fin.close();
		
		
		
		
	}

}
