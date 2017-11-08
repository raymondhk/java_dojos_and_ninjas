package com.project.DojosAndNinjas.controllers;

import java.security.Principal;
import java.util.Date;
import java.util.List;

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
import com.project.DojosAndNinjas.models.Ninja;
import com.project.DojosAndNinjas.services.EnrollService;

@Controller
public class Ninjas{
	private final EnrollService enroll;

	public Ninjas(EnrollService enroll){
		this.enroll = enroll;
	}
	
	@RequestMapping("/ninjas/new")
	public String newNinja(Model model, @ModelAttribute("ninja") Ninja ninja, BindingResult res){
		model.addAttribute("dojos", enroll.allDojos());
		return "newNinja";
	}
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult res, Model model) {
		if(res.hasErrors()) {
			model.addAttribute("dojos", enroll.allDojos());
			return "newNinja";
		} else {
			Ninja curNinja = enroll.createNinja(ninja);
			String dojoId = Long.toString(curNinja.getDojo().getId());
			return "redirect:/dojos/".concat(dojoId);
		}
	}	
}
