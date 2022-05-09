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
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dojoNinjas.models.Dojo;
import com.java.dojoNinjas.services.NinjaDojoService;

@Controller
@RequestMapping("/dojo")
public class DojoController {
	@Autowired
	private NinjaDojoService nDService;
	
	@GetMapping("/new")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		this.nDService.createDojo(dojo);
		return "redirect:/ninja/new";
	}
	@GetMapping("/{id}")
	public String details(@PathVariable("id")Long id,Model model) {
		model.addAttribute("dojo", this.nDService.findDojo(id));
		return "details.jsp";
	}
}
