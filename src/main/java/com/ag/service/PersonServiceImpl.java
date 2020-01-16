package com.ag.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.entity.PersonEntity;
import com.ag.model.Person;
import com.ag.repository.PersonRepository;
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepo;

	@Override
	public Person savePersonDtls(Person person) {
		PersonEntity entity = new PersonEntity();
		BeanUtils.copyProperties(person, entity);
		PersonEntity personEntity = personRepo.save(entity);
		
		Person person1 = new Person();
		BeanUtils.copyProperties(personEntity, person1);
		return person1;
	}

	@Override
	public Optional<PersonEntity> fetchPersonDetailsById(Integer pid) {
		return personRepo.findById(pid);
		 
	}

}
