package com.ag.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
@Data
@Table(name = "PERSON_DTLS")
@Entity
public class PersonEntity {
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "perSeq", initialValue = 701, allocationSize = 1)
	@GeneratedValue(generator = "mySeqGen")
	@Column(name = "PERSON_ID",length = 10)
	private Integer pid;
	
	@Column(name = "F_NAME",length = 10)
	private String fName;
	
	@Column(name = "L_NAME",length = 10)
	private String lName;
	
	@Column(name = "EMAIL",length = 30)
	 private String email;
	
	@Column(name = "DOB",length = 20)
	private Date dob;
	
	@Column(name = "GENDER",length = 10)
	 private String gender;
	
	@Column(name = "AADHAR",length = 12)
	 private Long aadhar;

}
