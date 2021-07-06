package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GugudanServlet")
public class GugudanServlet extends HttpServlet {	//클래스		HttpServlet 상속받는중
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 코드 짠거 여기에 써줌.
		//Get방식으로 보냄
		
		PrintWriter out = response.getWriter();
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		out.println("<table border = '1'>");	//html 표기하는법임.
		
		
		for(int i = 1; i <= 9; i++) {
		
			out.println("		<tr>");
			out.println("			<td>" + dan + "</td>");
			out.println("			<td>" + i + "</td>");
			out.println("			<td>" + dan * i + "</td>");
			out.println("		</tr>");
			
		}
		
		out.println("</table>");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		// 코드 짠거 여기에 써줌.
		
		//Post방식으로 보냄
		doGet(request, response);	//post로 온거 get로 보냄
	}

}
