package com.xworkz.membership.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class GymMembershipDto {
private int id;
	private String fullName;
	private int age;
	private String gender;
	private String address;
}
