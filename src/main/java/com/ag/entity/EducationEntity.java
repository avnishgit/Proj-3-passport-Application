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

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

/**
 * This class store persistence data
 * 
 * @author AVNISH SINGH
 * @version 3.1
 */
@Data
@Entity
@Table(name = "EDU_DTLS")
public class EducationEntity {
	@Id
	@SequenceGenerator(name = "mySeqGen", sequenceName = "eduSeq", initialValue = 601, allocationSize = 1000)
	@GeneratedValue(generator = "mySeqGen")
	@Column(name = "EDU_ID", length = 10)
	private Integer eduId;
	
	@Column(name = "QUALIFACTION", length = 20)
	private String qualifaction;
	
	@Column(name = "UNIVERSITY", length = 20)
	private String university;
	
	@Column(name = "PASSOUT", length = 20)
	private Integer year;
	
	@Column(name = "CREATED_DT")
	@CreationTimestamp
	private Date createdDt;
	
	@Column(name = "UPDATED_DT")
	@UpdateTimestamp
	private Date updatedDt;
	
	@OneToOne
	@JoinColumn(name = "PERSON_ID")
	private PersonEntity personEntity;
}
