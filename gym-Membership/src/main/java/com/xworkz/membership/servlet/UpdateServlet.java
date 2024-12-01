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
import com.xworkz.membership.service.GymMembershipService;
import com.xworkz.membership.service.GymMembershipServiceImpl;


@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    public UpdateServlet() {
       
       
    }


	public void doGet(HttpServletRequest request, HttpServletResponse response)  {
		System.out.println("Search operation");
		GymMembershipRepoImpl rep=new GymMembershipRepoImpl();
		GymMembershipService service = new GymMembershipServiceImpl(rep);
		int id = Integer.parseInt(request.getParameter("id"));
		GymMembershipDto dto=service.searchById(id);
	request.setAttribute("search", dto);
		
		
		

		RequestDispatcher req=request.getRequestDispatcher("update.jsp");
		try {
			req.forward(request, response);
		} catch (ServletException | IOException e) {
		
			e.printStackTrace();
		}
	}

	
	


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Update operation");
		GymMembershipDto dto = new GymMembershipDto();
		dto.setFullName(request.getParameter("fullName"));
		dto.setAge(Integer.parseInt(request.getParameter("age")));
		dto.setGender(request.getParameter("gender"));
		dto.setAddress(request.getParameter("address"));

		GymMembershipRepoImpl rep=new GymMembershipRepoImpl();
		GymMembershipServiceImpl service = new GymMembershipServiceImpl(rep);
		int id = Integer.parseInt(request.getParameter("id"));
		
		String updateResult = service.updatebyId(id, dto);
		
		
		request.setAttribute("updateResult", updateResult);

		RequestDispatcher dispatch = request.getRequestDispatcher("view.jsp");
		
		try {
			dispatch.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}



}
