package com.brian.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brian.dojosandninjas.models.Dojo;
import com.brian.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	private DojoRepository dojoRepository;

	
	//Create Dojo
	public Dojo createDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	
	//Get all dojos
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}
}
