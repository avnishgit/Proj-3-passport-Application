
package com.ag.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ag.entity.EducationEntity;
import com.ag.model.Education;
import com.ag.service.EducationService;

/**
 * This class is used to take education details from jsp page
 * 
 * @author AVNISH SINGH
 * @version 3.1
 */
@Controller
public class EducationController {
	@Autowired
	private EducationService eduService;

	/**
	 * This method is used to display form page
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping("/education")
	public String displayForm(Model model, HttpServletRequest req) {
		Education education = new Education();
		String parameter = req.getParameter("pid");
		int pid = Integer.parseInt(parameter);
		education.setPid(pid);
		model.addAttribute("educationBean", education);
		
		List<String> listUni = eduService.getUniversitys();
		model.addAttribute("listUni", listUni);
		
		List<String> listDegree = eduService.getDegrees();
		model.addAttribute("listDegree", listDegree);
		
		
		List<String> listYear = eduService.getYears();
		model.addAttribute("listYear", listYear);
		return "education";
	}

	/**
	 * This method is used to read form data and redirect to passport page
	 * 
	 * @param education
	 * @param model
	 * @return passport
	 */
	@PostMapping("/educationSubmit")
	public String nextBtn(@ModelAttribute("educationBean") Education education, Model model) {
		 EducationEntity save = eduService.saveEducationDtdls(education);
		return "redirect:/passportPage?eid="+save.getEduId();
	}
}
