package com.ag.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ag.entity.PassoutEntity;

/**
 * 
 * @author AVNISH SINGH
 * @version 3.1
 */
@Repository
public interface PassoutRepository extends JpaRepository<PassoutEntity, Integer> {

	@Modifying
	@Query("SELECT YEAR FROM PassoutEntity")
	public List<String> findYear();
}
