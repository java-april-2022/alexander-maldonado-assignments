package com.java.bookClub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.bookClub.models.Book;
import com.java.bookClub.models.User;
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
	
	@GetMapping("/books/add")
	public String addBookPage(Model model, HttpSession session, @ModelAttribute("newBook") Book book) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		User user= uBService.findById((Long)session.getAttribute("userID"));
		model.addAttribute("user", user);
		return "newBook.jsp";
	}
	
	@PostMapping("/add")
	public String addBook(@Valid @ModelAttribute("newBook") Book book, BindingResult result) {
		if (result.hasErrors()) {
			return "newBook.jsp";
		}
		uBService.create(book);
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}")
	public String viewBook(Model model, @PathVariable("id") Long id, HttpSession session) {
		if(session.getAttribute("userId")==null) {
			return "redirect:/";
		}
		Book book = uBService.getOneBook(id);
		model.addAttribute("book",book);
		model.addAttribute("user", uBService.findById((Long)session.getAttribute("userId")));
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
