package com.realdolmen.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.realdolmen.domain.Person;
import com.realdolmen.repositories.PersonRepository;

@ApplicationScoped
public class PersonService {
	
	@Inject
	private PersonRepository personRepository;

	public Person savePerson(Person person) {
		return personRepository.savePerson(person);
	}

	public Person findPersonById(int id) {
		return personRepository.findPersonById(id);
	}

	public PersonRepository getPersonRepository() {
		return personRepository;
	}
}
