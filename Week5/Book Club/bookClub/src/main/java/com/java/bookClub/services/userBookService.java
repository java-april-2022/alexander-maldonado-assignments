package com.java.bookClub.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.java.bookClub.models.Book;
import com.java.bookClub.models.LoginUser;
import com.java.bookClub.models.User;
import com.java.bookClub.repositories.BookRepository;
import com.java.bookClub.repositories.UserRepository;

@Service
public class userBookService {
	@Autowired
	private UserRepository uRepo;
	@Autowired
	private BookRepository bRepo;
	
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
	
	public User findById(Long id) {
		Optional<User> result= uRepo.findById(id);
		if(result.isPresent()) {
		return result.get();
		}
		return null;
	}
	
    public User register(User newUser, BindingResult result) {
        Optional<User> userFind = uRepo.findByEmail(newUser.getEmail());
        
        if(userFind.isPresent()) {
        	result.rejectValue("email", "Matches", "Unable to Sign up,Please log in");
        }
        
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
        	result.rejectValue("confirm", "Matches", "Passwords don't match");
        }
        if(result.hasErrors()) {
        	return null;
        }
        
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		newUser.setAdmin(this.uRepo.getCount()==0);
		return this.uRepo.save(newUser);
    }
    public User login(LoginUser newLogin, BindingResult result) {
    	Optional<User> userFind = uRepo.findByEmail(newLogin.getEmail());
    	
    	if(!userFind.isPresent()) {
    		result.rejectValue("email", "Matches", "Please Sign Up");
    		return null;
    	}
    	
    	User user = userFind.get();
    	
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    		result.rejectValue("password", "Matches", "Invalid Password");
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
    	
        return user;
    }
    public User findByEmail(String email) {
    	Optional<User> userEmail = uRepo.findByEmail(email);
    	if(userEmail.isPresent()) {
    		return userEmail.get();
    	}
    	return null;
    }
}
