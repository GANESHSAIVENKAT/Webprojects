package com.xworkz.membership.repo;

import java.util.List;


import com.xworkz.membership.dto.GymMembershipDto;

public interface GymMembershipRepo {

	boolean onsave(GymMembershipDto dto);
	List<GymMembershipDto>read();
	boolean deleteById(int id);
	GymMembershipDto searchById(int id);
	String updatebyName(int id,GymMembershipDto dto);
}
