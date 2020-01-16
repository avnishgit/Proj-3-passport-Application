package com.ag.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ag.model.Education;
import com.ag.model.Passport;
import com.ag.model.Person;
/**
 * This is used to take input from jsp page
 * @author AVNISH SINGH
 * @version 3.1
 */
import com.ag.service.PassportService;

@Controller
public class PassportController {

	@Autowired
	PassportService passService;

	/**
	 * This method is used to display passport page
	 * 
	 * @param model
	 * @return passport
	 */
	@GetMapping("/passportPage")
	public String displayForm(Model model, HttpServletRequest req) {

		String eduId = req.getParameter("eid");
		Integer eid = Integer.parseInt(eduId);

		Passport passport = passService.fethEducationDtls(eid);

		model.addAttribute("passportBean", passport);
		return "passport";
	}

	/**
	 * This method is used to take form data and redirect to success page
	 * 
	 * @param passport
	 * @param model
	 * @return success
	 */
	@PostMapping("/passportSubmit")
	public String submitBtn(@ModelAttribute("passportBean") Passport passport, Model model) {
		Passport savePassport = passService.savePassport(passport);
		
		return "redirect:passport";
	}
	@GetMapping("/passport")
	 public String getPassportNumber(@ModelAttribute("passportBean") Passport passport, Model model) {
			Passport pass = passService.savePassport(passport);
			if(pass!=null) {
				model.addAttribute("passportNum", pass.getPassportNum());
			}
			return "success";

	 }
	
}
