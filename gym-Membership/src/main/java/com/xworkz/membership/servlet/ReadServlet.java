package com.xworkz.membership.servlet;


import java.io.IOException;


import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.membership.dto.GymMembershipDto;
import com.xworkz.membership.repo.GymMembershipRepoImpl;
import com.xworkz.membership.service.GymMembershipServiceImpl;


@WebServlet(urlPatterns = "/view")
public class ReadServlet extends HttpServlet {

	public ReadServlet() {

	}

	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GymMembershipRepoImpl rep=new GymMembershipRepoImpl();
		GymMembershipServiceImpl ser = new GymMembershipServiceImpl(rep);
		
		List<GymMembershipDto> list = ser.read();
		
		req.setAttribute("listofdto", list);
		
		RequestDispatcher request=req.getRequestDispatcher("view.jsp");
		request.forward(req, resp);
		
	}
	
	
	
}
