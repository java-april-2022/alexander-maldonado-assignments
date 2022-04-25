package com.daikichipath.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping("")
	public String home() {
		return "welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tommorrow")
	public String tommorrow() {
		return "Tommorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{place}")
	public String travel(@PathVariable String place) {
		return "Congradulations! You will soon travel to "+ place;
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable int num) {
		if (num % 2 == 0) {
			return "You will take a grand journey in the near future,but be wary of tempting offers";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with familly";
		}
	}
}
