package com.itwill.model2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.summer.Controller;

public class MainController implements Controller{

	@Override
	public String handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) {
		// TODO Auto-generated method stub
		return "forward:/WEB-INF/views/main.jsp";
	}

}
