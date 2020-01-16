package com.ag.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ag.entity.DegreeEntity;
/**
 * 
 * @author AVNISH SINGH
 * @version 3.1
 */
@Repository
public interface DegreeRepository extends JpaRepository<DegreeEntity, Integer> {

	@Transactional
	@Modifying
	@Query("SELECT degree FROM DegreeEntity")
	public List<String> findDegree();
}
