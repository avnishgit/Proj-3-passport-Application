package com.ag.service;

import org.springframework.stereotype.Service;
/**
 * This interface store B.operation method
 *  * @author AVNISH SINGH
 * @version 3.1
 */

import com.ag.model.Education;
import com.ag.model.Passport;
import com.ag.model.Person;
@Service
public interface PassportService {

	public Person fethPersonDtls(Integer id);
	public Passport fethEducationDtls(Integer eid);
	public Passport savePassport(Passport passport);
}
