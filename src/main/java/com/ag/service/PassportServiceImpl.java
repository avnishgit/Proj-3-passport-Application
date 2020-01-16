package com.ag.service;

import java.util.Optional;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.entity.EducationEntity;
import com.ag.entity.PassportEntity;
import com.ag.entity.PersonEntity;
import com.ag.model.Education;
import com.ag.model.Passport;
import com.ag.model.Person;
import com.ag.repository.EducationRepository;
import com.ag.repository.PassportRepository;
import com.ag.repository.PersonRepository;

@Service
public class PassportServiceImpl implements PassportService {

	@Autowired
	private PersonRepository personRepo;
	@Autowired
	private EducationRepository eduRepo;
	@Autowired
	private PassportRepository passRepo;

	@Override
	public Person fethPersonDtls(Integer id) {

		Optional<PersonEntity> optional = personRepo.findById(id);
		Person person = null;
		if (optional.isPresent()) {
			PersonEntity entity = optional.get();
			person = new Person();
			BeanUtils.copyProperties(entity, person);
		}
		return person;
	}

	/**
	 * This method is used to fetch Education Detail
	 */
	@Override
	public Passport fethEducationDtls(Integer eid) {
		Education edu = null;
		Passport passport = null;
		Optional<EducationEntity> optional = eduRepo.findById(eid);
		if (optional.isPresent()) {
			EducationEntity entity = optional.get();
			passport = new Passport();
			BeanUtils.copyProperties(entity, passport);
			BeanUtils.copyProperties(entity.getPersonEntity(), passport);

		}

		return passport;
	}

	/**
	 * 
	 * @return
	 */
	public String randomAlphanumric() {
		String generatedString = RandomStringUtils.randomAlphanumeric(10);

		return generatedString;
	}

	@Override
	public Passport savePassport(Passport passport) {

		PassportEntity entity = new PassportEntity();
		BeanUtils.copyProperties(passport, entity);

		entity.setPassportNum(randomAlphanumric());

		PassportEntity save = passRepo.save(entity);
		BeanUtils.copyProperties(save, passport);
		return passport;
	}

}
