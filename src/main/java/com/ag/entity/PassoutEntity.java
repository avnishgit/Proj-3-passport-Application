package com.ag.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class contain pass out year
 * @author AVNISH SINGH
 * @version 3.1
 */
@Entity
@Table(name = "YEAR_MASTER")
public class PassoutEntity {

	@Id
	@Column(name = "YEAR_ID",length = 10)
	private Integer id;
	@Column(name = "YEAR",length = 5)
	private Integer year;
}
