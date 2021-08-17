package com.brian.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.dojosandninjas.models.Ninja;
import com.brian.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepository;
	
	//Create Ninja
	public Ninja createNinja(Ninja n) {
		return ninjaRepository.save(n);
	}
	
	//Get all ninjas
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
}
