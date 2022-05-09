package com.java.bookClub.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message="Name Can't be Left BLank")
    @Size(min = 2, max = 20, message="Name must be between 2 and 20 characters")
    private String name;
	
	@NotEmpty(message="Email Can't be Left Blank")
    @Email(message="Please enter a valid email")
    private String email;
	
	@NotEmpty(message="Password Required")
    @Size(min=8, message="Password must be at least 8 charcters long")
    private String password;
    
	@Transient
    @NotEmpty(message="Confirm Password can't be left blank")
    @Size(min=8, message="Password must be at least 8 characters long")
    private String confirm;
    
	private boolean isAdmin = false;
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @OneToMany(mappedBy="user",fetch=FetchType.LAZY)
    	private List<Book> books;
    
    public User() {
    }
    



	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getConfirm() {
		return confirm;
	}




	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}




	public boolean isAdmin() {
		return isAdmin;
	}




	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}




	public Date getCreatedAt() {
		return createdAt;
	}




	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}




	public Date getUpdatedAt() {
		return updatedAt;
	}




	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




	public List<Book> getBooks() {
		return books;
	}




	public void setBooks(List<Book> books) {
		this.books = books;
	}




	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
