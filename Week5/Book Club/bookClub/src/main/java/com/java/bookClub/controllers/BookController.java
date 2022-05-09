package com.java.bookClub.controllers;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.bookClub.services.userBookService;

@Controller
public class BookController {
	@Autowired
	private userBookService uBService;

	@GetMapping("/books")
	public String bookHome(Model bookModel, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		bookModel.addAttribute("books", uBService.allBooks());
		bookModel.addAttribute("user", uBService.findById((Long)session.getAttribute("userId")));
		return "books.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.setAttribute("userId", null);
		return "redirect:/";
	}
	

	
	@GetMapping("/books/{id}")
	public String viewBook() {
		return "view.jsp";
	}
	
	@GetMapping("/books/{id}/edit")
	public String editBook() {
		return "edit.jsp";
	}
	
	@PostMapping("/books/{id}/submit")
	public String submiit() {
		return "redirect:books.jsp";
	}
}
