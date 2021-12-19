package com.cos.humor.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
//web.xml에 서블릿맵핑안해도됨
//서블릿맵핑은뭐냐
//리플랙션?
//인보크?
public class ApiServerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public ApiServerTest() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String food = request.getParameter("food");
		String method = request.getParameter("method");
		
		int result = 1;
		PrintWriter out = response.getWriter();
		out.println(result);
		out.flush();
	}

}
