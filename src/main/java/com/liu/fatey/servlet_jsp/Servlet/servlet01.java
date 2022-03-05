package com.liu.fatey.servlet_jsp.Servlet;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//注解的，就不用在web.xml中进行mapping映射
//@WebServlet("/ser01")
public class servlet01 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Hello world! Servlet");
		//response.getWriter().write("Hello Servlet!");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello world! Servlet");
		response.getWriter().write("Hello Servlet!");
	}
}
