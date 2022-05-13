package com.mvc.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mvc.savetravels.models.Expense;
import com.mvc.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	private final ExpenseRepository expenseRepo;
	
	public ExpenseService(ExpenseRepository expenseRepo) {
		this.expenseRepo = expenseRepo;
	}
	// returns all the expenses
    public List<Expense> all() {
        return expenseRepo.findAll();
    }
    // creates an expense
    public Expense create(Expense e) {
        return expenseRepo.save(e);
    }
    
    //retrieves an expense
    public Expense find(Long id) {
        Optional<Expense> optionalExpense = expenseRepo.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
	//deletes an expense
    public void delete(Long id) {
    	expenseRepo.deleteById(id);
    }
    //updates an expense
    public Expense update(Expense e) {
    	return expenseRepo.save(e);
    }
}
