package com.itwill.model2.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.summer.Controller;

public class ListController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		/*
		Service service=new Service();
		Arraylist list=service.list();
		*/
		ArrayList list=new ArrayList();
		list.add("KIM");
		list.add("LEE");
		list.add("PARK");
		list.add("CHOI");
		request.setAttribute("list", list);
		
		return "forward:/WEB-INF/views/list.jsp";
	}

}
