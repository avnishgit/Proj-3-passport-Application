package com.ag.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ag.entity.EducationEntity;
import com.ag.model.Education;

@Service
public interface EducationService {

	public List<String> getDegrees();
	public List<String> getYears();
	public List<String> getUniversitys();
	public EducationEntity saveEducationDtdls(Education edu);
}
