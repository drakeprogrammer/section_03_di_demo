package pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	private SetterInjectedController setterInjectedController;

	@Before
	public void setUp() {
		this.setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new GreetingServiceImpl());
	}


	@Test
	public void testGreeting() {
		Assert.assertEquals(GreetingServiceImpl.SAY_HELLO, setterInjectedController.sayHello());
	}
}