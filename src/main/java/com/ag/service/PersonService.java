package com.ag.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ag.entity.PersonEntity;
import com.ag.model.Person;

@Service
public interface PersonService {

	public Person savePersonDtls(Person person);

	public Optional<PersonEntity> fetchPersonDetailsById(Integer pid);
}
