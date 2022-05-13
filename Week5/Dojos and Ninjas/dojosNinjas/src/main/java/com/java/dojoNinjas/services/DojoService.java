package com.java.dojoNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dojoNinjas.models.Dojo;
import com.java.dojoNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepository;
	
	// returns all the dojos
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }
    // creates a dojo
    public Dojo createDojo(Dojo d) {
    	return dojoRepository.save(d);
    }
    
    // retrieves a dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
}
