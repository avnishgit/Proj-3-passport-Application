package com.ag.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ag.entity.PersonEntity;
import com.ag.model.Person;
import com.ag.service.PersonService;
/**
 * This is used to take form data from jsp  page
 * @author AVNISH SINGH
 * @version 3.1
 */
@Controller
public class PersonController {

	@Autowired
	private PersonService personService;
	
	/**
	 * This method is used to display form page
	 * @param model
	 * @return String
	 */
	@GetMapping("/personForm")
	public String displayForm(Model model) {
		Person person = new Person();
		model.addAttribute("personBean", person);
		return "person";
	}
	@PostMapping("/personSubmit")
	public String nextBtn(@ModelAttribute("personBean") Person person,Model model,RedirectAttributes attributes) {
		 Person save = personService.savePersonDtls(person);
		if(save!=null) {
			return "redirect:/education?pid="+ save.getPid();
		}
		return "person";
	}
	
	@GetMapping(value="/getPersonDataById")
	public String fetchPersonInfoById(Model model,HttpServletRequest req)
	{
		
		String id = req.getParameter("personId");
		Person pdetails=new Person();
		if(id!=null & !id.isEmpty())
		{
			Integer  pid=Integer.parseInt(id);
			Optional<PersonEntity> fetchPersonDetailsById = personService.fetchPersonDetailsById(pid);
			if(fetchPersonDetailsById.isPresent())
			{
				PersonEntity pde=fetchPersonDetailsById.get();
				BeanUtils.copyProperties(pde, pdetails);
			}
       model.addAttribute("personBean" ,pdetails);
		}
		return "person";
	}
}
