package com.java.bookClub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.bookClub.models.LoginUser;
import com.java.bookClub.models.User;
import com.java.bookClub.services.UserServices;

@Controller
public class HomeController {
	@Autowired
	private UserServices uService;
	
	@GetMapping("/")
	public String index(Model model) {
		
	    model.addAttribute("newUser", new User());
	    model.addAttribute("newLogin", new LoginUser());
	    return "index.jsp";
	    
	}
	 
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model userModel, HttpSession session) {
	     
		User user = uService.register(newUser, result);
		
	    if(result.hasErrors()) {
	        userModel.addAttribute("newLogin", new LoginUser());
	        return "index.jsp";
	    }
	    
	    session.setAttribute("user_id", user.getId());
	 
	    return "redirect:/books";
	}
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model, HttpSession session) {
	     
		User user = uService.login(newLogin, result);
	 
	    if(result.hasErrors() || user==null) {
	        model.addAttribute("newUser", new User());
	        return "index.jsp";
	    }
	     
	    session.setAttribute("user_id", user.getId());
	 
	    return "redirect:/books";
	}
	
	

}
