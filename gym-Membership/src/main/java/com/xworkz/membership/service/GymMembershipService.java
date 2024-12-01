package com.xworkz.membership.service;

import java.util.List;

import com.xworkz.membership.dto.GymMembershipDto;

public interface GymMembershipService {

	String onsave(GymMembershipDto dto);
	List<GymMembershipDto>read();
	String deleteById(int id);
	GymMembershipDto searchById(int id);
	String updatebyId(int id,GymMembershipDto dto);
}
