package com.ag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ag.entity.PassportEntity;
/**
 * This interface is use to keep persistence logic 
 * @author AVNISH SINGH
 * @version 3.1
 */
@Repository
public interface PassportRepository extends JpaRepository<PassportEntity, Integer> {

}
