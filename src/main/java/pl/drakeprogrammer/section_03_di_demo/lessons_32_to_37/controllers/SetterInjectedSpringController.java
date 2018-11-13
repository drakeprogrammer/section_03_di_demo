package pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.services.GreetingServiceImpl;

@Controller
public class SetterInjectedSpringController {


	private GreetingServiceImpl greetingService;

	public String sayHello() {
		return greetingService.sayHello();
	}

	@Autowired
	public void setGreetingService(GreetingServiceImpl greetingService) {
		this.greetingService = greetingService;
	}
}
