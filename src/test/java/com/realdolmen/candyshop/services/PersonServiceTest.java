package com.realdolmen.candyshop.services;

import com.realdolmen.candyshop.AbstractWeldContainerTest;
import com.realdolmen.services.PersonService;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PersonServiceTest extends AbstractWeldContainerTest {
    private PersonService personService;

    @Before
    public void initialize() {
        personService = container.instance().select(PersonService.class).get();
    }

    @Test
    public void personServiceHasPersonRepository() throws Exception {
        assertNotNull(personService);
        personService.findPersonById(1507);
        assertNotNull(personService.getPersonRepository());
    }
}
