package com.ag.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.ag.entity.PersonEntity;

import lombok.Data;

@Data
public class Education {

	private Integer eduId;
	private String qualifaction;
	private String university;
	private Integer year;
	@CreationTimestamp
	private Timestamp createdDt;
	@UpdateTimestamp
	private Timestamp updatedDt;
	private Integer pid;
}
