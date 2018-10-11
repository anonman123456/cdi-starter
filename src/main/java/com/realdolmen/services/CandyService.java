package com.realdolmen.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.realdolmen.domain.Candy;
import com.realdolmen.domain.CandyColor;
import com.realdolmen.repositories.CandyRepository;

@ApplicationScoped
public class CandyService {

	@Inject
	private CandyRepository candyRepository;
	@Inject
	private PersonService personService;
	
	public List<Candy> findAllCandy() {
		return candyRepository.findAllCandy();
	}

	public List<Candy> findCandyByColor(CandyColor color) {
		return candyRepository.findCandyByColor(color);
	}

	public CandyRepository getCandyRepository() {
		return candyRepository;
	}

	public PersonService getPersonService() {
		return personService;
	}
}