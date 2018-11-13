package pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers;

import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.services.GreetingServiceImpl;

public class SetterInjectedController {

	private GreetingServiceImpl greetingService;

	public String sayHello() {
		return greetingService.sayHello();
	}

	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
}
