package com.realdolmen.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.realdolmen.domain.Candy;
import com.realdolmen.domain.CandyColor;

@ApplicationScoped
public class CandyRepository {
	
	@Inject
	private Logger logger;
	private ArrayList<Candy> candies = new ArrayList<>();

	public ArrayList<Candy> findAllCandy() {
		logger.info("Listing all candy");
		return candies;
	}

	public List<Candy> findCandyByColor(CandyColor color) {
		logger.info("Finding candy by color");
		return candies.stream().filter(candy -> candy.getColor() == color)
                .collect(Collectors.toList());
	}

}