package com.ag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ag.entity.PersonEntity;

/**
 * This class is used to  keep persistence logic
 * @author AVNISH SINGH
 * @version 3.1
 */
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer>{

}
