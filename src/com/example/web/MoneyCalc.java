package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class MoneyCalc extends HttpServlet {
	
	public void doPost(HttpServletRequest request,
					HttpServletResponse response)
					throws IOException, ServletException {
						
		String name = request.getParameter("name");
		String cashPar = request.getParameter("cash");
		int cash = Integer.parseInt(cashPar);
		
		ListofPeople listP = new ListofPeople();
		listP.setPeople(name,cash);
		
		
	
		ServletContext context = getServletContext();
		String adminEmail = context.getInitParameter("adminEmail");
		
		request.setAttribute("listP", listP);
		request.setAttribute("adminEmail", adminEmail);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request,response);
		
	}		
}
