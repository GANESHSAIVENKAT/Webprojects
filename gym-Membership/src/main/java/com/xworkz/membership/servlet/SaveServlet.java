package com.xworkz.membership.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.membership.dto.GymMembershipDto;
import com.xworkz.membership.repo.GymMembershipRepoImpl;
import com.xworkz.membership.service.GymMembershipServiceImpl;

@WebServlet(urlPatterns = "/save")

public class SaveServlet extends HttpServlet{

	public SaveServlet() {
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	GymMembershipDto dto = new GymMembershipDto();
	dto.setFullName(req.getParameter("fullName"));
	dto.setAge(Integer.parseInt(req.getParameter("age")));
	dto.setGender(req.getParameter("gender"));
	dto.setAddress(req.getParameter("address"));

	GymMembershipRepoImpl rep=new GymMembershipRepoImpl();
	GymMembershipServiceImpl ser = new GymMembershipServiceImpl(rep);
	String result=ser.onsave(dto);
	req.setAttribute("result", result);
	
	RequestDispatcher request=req.getRequestDispatcher("success.jsp");
	request.forward(req, resp);

		
	}
	
}
