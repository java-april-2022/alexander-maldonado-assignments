package com.java.dojoNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dojoNinjas.models.Dojo;
import com.java.dojoNinjas.models.Ninja;
import com.java.dojoNinjas.services.NinjaDojoService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	@Autowired
	private NinjaDojoService nDService;
	
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model model){
		List<Dojo> allDojos = this.nDService.allDojos();
		model.addAttribute("allDojos",allDojos);
		return "index.jsp";
	}
	
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> allDojos=this.nDService.allDojos();
			model.addAttribute("allDojos", allDojos);
			return "index.jsp";
		}
		this.nDService.createNinja(ninja);
		return "redirect:/dojo/" + ninja.getDojo().getId();
	}
}
