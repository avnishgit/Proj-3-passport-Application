package com.ag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * This class contain university name
 * @author AVNISH SINGH
 * @version 3.1
 */
@Entity
@Table(name = "UNIVERCITY_MASTER")
@Data
public class UniversityEntity {

	@GeneratedValue
	@Id
	@Column(name = "U_ID",length = 10)
	private Integer id;
	@Column(name = "U_NAME",length = 20)
	private String uName;
}
