package com.java.bookClub.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotEmpty(message="Book Title Can't be Left BLank")
    @Size(min = 4, max = 30)
    private String title;
	
	@NotEmpty(message="Book Author Can't be Left BLank")
    @Size(min = 4, max = 20)
    private String author;
	
	@NotEmpty(message="Book Discription Can't be Left BLank")
    @Size(min = 25, max = 250)
    private String discription;
	
	@Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    
    public Book() {
    	
    }
    
    




	public Long getId() {
		return id;
	}






	public void setId(Long id) {
		this.id = id;
	}






	public String getTitle() {
		return title;
	}






	public void setTitle(String title) {
		this.title = title;
	}






	public String getAuthor() {
		return author;
	}






	public void setAuthor(String author) {
		this.author = author;
	}






	public String getDiscription() {
		return discription;
	}






	public void setDiscription(String discription) {
		this.discription = discription;
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






	public User getUser() {
		return user;
	}






	public void setUser(User user) {
		this.user = user;
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
