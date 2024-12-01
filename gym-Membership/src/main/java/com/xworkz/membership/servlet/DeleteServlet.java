package com.xworkz.membership.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.membership.repo.GymMembershipRepoImpl;
import com.xworkz.membership.service.GymMembershipServiceImpl;


@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	public void doGet(HttpServletRequest request, HttpServletResponse response)  {
		GymMembershipRepoImpl rep=new GymMembershipRepoImpl();
		GymMembershipServiceImpl ser = new GymMembershipServiceImpl(rep);
		
		int id = Integer.parseInt(request.getParameter("id"));
		String delete=ser.deleteById(id);
		request.setAttribute("delete", delete);
		
		
		
		RequestDispatcher req=request.getRequestDispatcher("view.jsp");
		try {
			req.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}


	

}
