package com.xworkz.membership.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import com.xworkz.membership.dto.GymMembershipDto;
import com.xworkz.membership.util.GymMembershipUtil;



public class GymMembershipRepoImpl implements GymMembershipRepo {

	@Override
	public boolean onsave(GymMembershipDto dto) {
		try {
			Connection connection=DriverManager.getConnection(GymMembershipUtil.JDBCURL,GymMembershipUtil.USERNAME,GymMembershipUtil.PASSWORD);
		String query="insert into membership(full_name,age,gender,address) values(?,?,?,?)";
			PreparedStatement statement =connection.prepareStatement(query);
		
			statement.setString(1, dto.getFullName());
			statement.setInt(2, dto.getAge());
			statement.setString(3, dto.getGender());
			statement.setString(4, dto.getAddress());
			if(!statement.execute()) {
				
				return true;
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	public List<GymMembershipDto> read() {
		List<GymMembershipDto> list = new ArrayList<GymMembershipDto>();

		try {
			Connection connection=DriverManager.getConnection(GymMembershipUtil.JDBCURL,GymMembershipUtil.USERNAME,GymMembershipUtil.PASSWORD);
			String readquery="select*from membership";
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(readquery);
		
			while (result.next()) {
				GymMembershipDto dtos=new GymMembershipDto();
				dtos.setId(result.getInt(1));
				dtos.setFullName(result.getString(2));
				dtos.setAge(result.getInt(3));
				dtos.setGender(result.getString(4));
				dtos.setAddress(result.getString(5));
				
				list.add(dtos);
			}
		}catch(SQLException e) {
			 return Collections.emptyList();

		}
		return list;
	}

	@Override
	public boolean deleteById(int id) {
	    try {
	        Connection connection = DriverManager.getConnection(GymMembershipUtil.JDBCURL, GymMembershipUtil.USERNAME, GymMembershipUtil.PASSWORD);
	        String query = "DELETE FROM membership WHERE id = ?";
	        PreparedStatement statement = connection.prepareStatement(query);
	        statement.setInt(1, id);
	        if(!statement.execute()) {
	        	 return true;
	        }
	       
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }

		return false;
	}

	@Override
	public GymMembershipDto searchById(int id) {
		 try {
		        Connection connection = DriverManager.getConnection(GymMembershipUtil.JDBCURL, GymMembershipUtil.USERNAME, GymMembershipUtil.PASSWORD);
		        String deletequery = "SELECT * FROM membership WHERE id = ?";
		        PreparedStatement statement = connection.prepareStatement(deletequery);
		        statement.setInt(1, id);
		        ResultSet resultSet = statement.executeQuery();

		        if (resultSet.next()) {
		        	GymMembershipDto dtos=new GymMembershipDto();
					dtos.setId(resultSet.getInt(1));
					dtos.setFullName(resultSet.getString(2));
					dtos.setAge(resultSet.getInt(3));
					dtos.setGender(resultSet.getString(4));
					dtos.setAddress(resultSet.getString(5));
		            return dtos;
		        }
		    } catch (SQLException e) {
		        System.out.println(e.getMessage());
		    }

			return new GymMembershipDto() ;

	}

	@Override
	public String updatebyName(int id, GymMembershipDto dto) {
		try {
			 Connection connection = DriverManager.getConnection(GymMembershipUtil.JDBCURL, GymMembershipUtil.USERNAME, GymMembershipUtil.PASSWORD);
		        String updatequery =  "update membership set full_name=?,age=?,gender=?,address=? where id = ?";
		        PreparedStatement statement = connection.prepareStatement(updatequery);
		        statement.setString(1, dto.getFullName());
				statement.setInt(2, dto.getAge() );
				statement.setString(3, dto.getGender() );
				statement.setString(4, dto.getAddress());

		        statement.setInt(5, id);

		        int updatedRows = statement.executeUpdate();
				
				return updatedRows+"Updated Done";

		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return "not updated";

	}

	
}
