package com.ag.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * This class is used to store persistence data
 * 
 * @author AVNISH SINGH
 * @version 3.1
 */
@Entity
@Data
@Table(name = "PASSPORT_APP_DTLS")
public class PassportEntity {

	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 401, allocationSize = 1000)
	@GeneratedValue(generator = "mySeqGen")
	@Column(name = "APP_ID", length = 10)
	private Integer appId;
	
	@Column(name = "PASSPORT_NUM", length = 10)
	private String passportNum;
	
	@Column(name = "CREATED_DT")
	private Date createdDt;
	
	@Column(name = "UPDATED_DT")
	private Date updatedDt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID")
	private PersonEntity personEntity;

}
