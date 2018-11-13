package pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers;

import org.springframework.stereotype.Controller;

import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.services.GreetingServiceImpl;

@Controller
public class ConstructorInjectedSpringController {

	private GreetingServiceImpl greetingService;

	public ConstructorInjectedSpringController(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHello() {
		return greetingService.sayHello();
	}
}
