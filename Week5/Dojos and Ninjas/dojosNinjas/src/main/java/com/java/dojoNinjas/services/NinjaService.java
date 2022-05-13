package com.java.dojoNinjas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.dojoNinjas.models.Ninja;
import com.java.dojoNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	private NinjaRepository ninjaRepository;

    // creates a ninja
    public Ninja createNinja(Ninja n) {
        return ninjaRepository.save(n);
    }
}
