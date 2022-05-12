package com.java.bookClub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.bookClub.models.Book;
import com.java.bookClub.repositories.BookRepository;

@Service
public class BookServices {

	@Autowired BookRepository bRepo;
	public List<Book> allBooks(){
		return this.bRepo.findAll();
	}
	
	public Book create(Book book) {
		return this.bRepo.save(book);
	}
	
	public Book update(Book book) {
		return this.bRepo.save(book);
	}
	
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
}
