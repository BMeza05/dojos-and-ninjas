package com.brian.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.brian.dojosandninjas.models.Dojo;
import com.brian.dojosandninjas.models.Ninja;
import com.brian.dojosandninjas.services.DojoService;
import com.brian.dojosandninjas.services.NinjaService;

@Controller
public class MainController {

	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	//New Dojo
	@GetMapping("/dojos")
	public String newDojo(@ModelAttribute  Dojo dojo,
			Model model ){
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos")
	public String createDojo(@Valid @ModelAttribute Dojo dojo, 
			BindingResult res) {
		
		dojoService.createDojo(dojo);
		return "redirect:/";
	}
	
	//New Ninja
	@GetMapping("/ninjas")
	public String newNinja(@ModelAttribute Ninja ninja,
			Model model){
		model.addAttribute("dojos", dojoService.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute Ninja ninja, 
			BindingResult res) {
		
		ninjaService.createNinja(ninja);
		return "redirect:/";
	}
	
	
}
