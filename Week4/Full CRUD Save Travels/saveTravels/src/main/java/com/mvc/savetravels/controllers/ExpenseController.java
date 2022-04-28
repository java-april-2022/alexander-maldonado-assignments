package com.mvc.savetravels.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpenseController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
}
