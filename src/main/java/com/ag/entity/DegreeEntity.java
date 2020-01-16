package com.ag.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * This class contain degree name
 * @author AVNISH SINGH
 * @version 3.1
 */
@Entity
@Table(name = "DEGREES_MASTER")
@Data
public class DegreeEntity {

	@Id
	@Column(name = "DEGREES_ID",length = 10)
	private Integer id;
	@Column(name = "DEGREE_NAME",length = 10)
	private String degree;
}
