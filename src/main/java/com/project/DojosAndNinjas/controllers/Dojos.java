package com.project.DojosAndNinjas.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.project.DojosAndNinjas.models.Dojo;
import com.project.DojosAndNinjas.services.EnrollService;

@Controller
public class Dojos{
	//Member variables go here
	private final EnrollService enroll;
	public Dojos(EnrollService enroll){
		this.enroll = enroll;
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo){
		return "newDojo";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult res) {
		if(res.hasErrors()){
			return "newDojo";
		} else {
			enroll.createDojo(dojo);
			return "redirect:/ninjas/new";
		}
	}

	@RequestMapping("/dojos/{id}")
	public String showDojo(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dojo", enroll.getOneDojo(id));
		return "showDojo";
	}
}
