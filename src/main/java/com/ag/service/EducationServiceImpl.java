package com.ag.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ag.entity.EducationEntity;
import com.ag.entity.PersonEntity;
import com.ag.model.Education;
import com.ag.repository.DegreeRepository;
import com.ag.repository.EducationRepository;
import com.ag.repository.PassoutRepository;
import com.ag.repository.UniversityRepository;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	private DegreeRepository degreeRepo;

	@Autowired
	private PassoutRepository passoutRepo;

	@Autowired
	private UniversityRepository uniRepo;
	
	@Autowired
	private EducationRepository eduRepo;

	@Override
	public List<String> getDegrees() {
		return degreeRepo.findDegree();

	}

	@Override
	public List<String> getYears() {
		return passoutRepo.findYear();

	}

	@Override
	public List<String> getUniversitys() {
		return uniRepo.findUniversity();

	}

	@Override
	public EducationEntity saveEducationDtdls(Education edu) {
		EducationEntity entity = new EducationEntity();
		BeanUtils.copyProperties(edu, entity);
		PersonEntity pe = new PersonEntity();
		
		pe.setPid(edu.getPid());
		entity.setPersonEntity(pe);
		System.out.println(entity);
		EducationEntity save = eduRepo.save(entity);
		System.out.println("ENTity"+save);
		return save;
	}

}
