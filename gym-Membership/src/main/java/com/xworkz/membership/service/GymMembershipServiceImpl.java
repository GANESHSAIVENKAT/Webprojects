package com.xworkz.membership.service;

import java.util.List;


import com.xworkz.membership.dto.GymMembershipDto;

import com.xworkz.membership.repo.GymMembershipRepoImpl;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class GymMembershipServiceImpl implements GymMembershipService {
	private GymMembershipRepoImpl repo;
	@Override
	public String onsave(GymMembershipDto dto) {
		if(dto!=null) {
			if(repo.onsave(dto)) {
				return "Saved";
			}
		}
		return "not save";
	}

	@Override
	public List<GymMembershipDto> read() {
	
		return repo.read();
	}

	@Override
	public String deleteById(int id) {
		if (repo.deleteById(id)) {
	        return "Deleted successfully";
	    }
	    return "Delete failed";
	}

	@Override
	public GymMembershipDto searchById(int id) {
		
		return repo.searchById(id);
	}

	@Override
	public String updatebyId(int id, GymMembershipDto dto) {
		
		 return "update"+repo.updatebyName(id, dto);
		 }
	
}
