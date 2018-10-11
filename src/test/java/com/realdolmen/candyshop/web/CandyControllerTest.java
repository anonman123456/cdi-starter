package com.realdolmen.candyshop.web;

import com.realdolmen.candyshop.AbstractWeldContainerTest;
import com.realdolmen.web.CandyController;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class CandyControllerTest extends AbstractWeldContainerTest {
    @Test
    public void candyControllerHasCandyService() throws Exception {
        CandyController candyController = container.instance().select(CandyController.class).get();
        assertNotNull(candyController);
        candyController.findAllCandy();
        candyController.findCandyByColor();
        assertNotNull(candyController.getCandyService());
    }
}
