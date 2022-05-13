package com.java.dojoNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.dojoNinjas.models.Dojo;
import com.java.dojoNinjas.services.DojoService;

@Controller
public class DojoController {
	@Autowired
	private DojoService dService;
	
	@GetMapping("/")
	public String direct() {
		return "redirect:/dojo/new";
	}
	
	@GetMapping("/dojo/new")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/dojo/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		this.dService.createDojo(dojo);
		return "redirect:/ninja/new";
	}
	@GetMapping("/dojo/{id}")
	public String details(@PathVariable("id")Long id,Model model) {
		model.addAttribute("dojo", this.dService.findDojo(id));
		return "details.jsp";
	}
}
