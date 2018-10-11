package com.realdolmen.web;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import com.realdolmen.domain.Person;
import com.realdolmen.services.PersonService;

@RequestScoped
public class PersonController {
	@Inject
	private PersonService personService;

	public Person savePerson(Person person) {
		return personService.savePerson(person);
	}
	
	public Person findPersonById(int id) {
		return personService.findPersonById(id);
	}

	public PersonService getPersonService() {
		return personService;
	}
}
