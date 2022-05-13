package com.mvc.savetravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.mvc.savetravels.models.Expense;
import com.mvc.savetravels.services.ExpenseService;

@Controller
public class ExpenseController {
	@Autowired 
	private ExpenseService eServe;

	@GetMapping("/")
	public String redirect() {
		return "redirect:/expense";
	}
	
	@GetMapping("/expense")
	public String index(
			Model model,
			@ModelAttribute("expenseAdd") Expense expense) {
		model.addAttribute("expense", eServe.all());
		return "index.jsp";
	}
	
	
    @DeleteMapping("/expense/{id}")
    public String destroy(@PathVariable("id") Long id) {
        eServe.delete(id);
        return "redirect:/";
    }


	@PostMapping("/expense")
	public String add(
			@Valid @ModelAttribute("expense") Expense expense,
			Model model,
			BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("expense", eServe.all());
			return "index.jsp";
		}
		eServe.create(expense);
		return "redirect:/";
	}
	
	
	@PutMapping("/expense/{id}")
	public String refresh(
			@Valid @ModelAttribute("expense") Expense expense,
			Model model,
			BindingResult result,
			@PathVariable("id")Long id) {
		if (result.hasErrors()) {
			model.addAttribute("expense", eServe.all());
			return "index.jsp";
		}
		eServe.update(expense);
		return "redirect:/";
	}

	@GetMapping("/expense/edit/{id}")
	public String edit(@PathVariable("id")Long id, Model model) {
		model.addAttribute("expense", eServe.all());
		model.addAttribute("expense", eServe.find(id));
		return "edit.jsp";
	}
	
	@GetMapping("/expense/view/{id}")
	public String view(@PathVariable("id")Long id, Model model) {
		model.addAttribute("expense", eServe.all());
		model.addAttribute("expense", eServe.find(id));
		return "details.jsp";
	}
	
	@GetMapping("/expense/delete/{id}")
	public String confirm(@PathVariable("id")Long id, Model model) {
		model.addAttribute("expense", eServe.all());
		model.addAttribute("expense", eServe.find(id));
		return "delete.jsp";
	}
}
