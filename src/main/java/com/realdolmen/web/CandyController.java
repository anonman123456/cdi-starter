package com.realdolmen.web;

import java.util.List;
import com.realdolmen.domain.Candy;
import com.realdolmen.services.CandyService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@RequestScoped
public class CandyController {
	
	@Inject
	private CandyService candyService;
	
	public List<Candy> findAllCandy() {
		return candyService.findAllCandy();
	}
	
	public List<Candy> findCandyByColor() {
		return candyService.findCandyByColor(null);
	}

	public CandyService getCandyService() {
		return candyService;
	}

}
