package com.java.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerForm {
	
	@GetMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
		public String results(HttpSession session, Model model) {
			String result = (String) session.getAttribute("results");
			model.addAttribute("result", result);
			return "results.jsp";
	}
	
	@PostMapping("/process")
	public String process(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("name") String name,
			@RequestParam("hobby") String hobby,
			@RequestParam("animal") String animal,
			@RequestParam("comment") String comment,
			HttpSession session
			) {
		String results = String.format("In %s years you will live in %s with %s as your roomate, %s. The next time you see a %s, you will have good luck. Also, %s. ", number, city, name, hobby, animal, comment);
		
		session.setAttribute("results", results);
		return "redirect:/omikuji/show";
	}
}
