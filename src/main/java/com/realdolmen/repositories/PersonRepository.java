package com.realdolmen.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.realdolmen.domain.Person;

@ApplicationScoped
public class PersonRepository {

	@Inject
	private Logger logger;
	private List<Person> persons = new ArrayList<Person>();
	
	public Person savePerson(Person person) {
		logger.info("Adding person: " + person.getId());
		persons.add(person);
		return person;
	}

	public Person findPersonById(int id) {
		logger.info("Finding person: " + id);
		Optional<Person> pers = persons.stream().filter(person -> person.getId() == id).findFirst();
		if(pers.isPresent()) {
			return pers.get();
		}
		return null;
	}

}
