package com.ag.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * This class is use to binding
 * 
 * @author AVNISH SINGH @version3.1
 */
@Data
public class Person {

	private Integer pid;
	private String fName;
	private String lName;
	private String email;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String gender;
	private Long aadhar;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date createdDt;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date updatedDt;
}
