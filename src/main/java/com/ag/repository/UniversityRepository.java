package com.ag.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ag.entity.UniversityEntity;
/**
 * 
 * @author AVNISH SINGH
 * @version 3.1
 */
@Repository
public interface UniversityRepository extends JpaRepository<UniversityEntity, Integer> {

	@Transactional
	@Modifying
	@Query("SELECT uName FROM UniversityEntity")
	public List<String> findUniversity();
}
