package com.ag.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class Passport {

	private String passportNum;
	private String fName;
	private String lName;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String gender;
	private Long aadhar;
	
	private String qualifaction;
	private String university;
	private Integer year;
}
