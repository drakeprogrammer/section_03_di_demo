package pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers;

import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.services.GreetingService;

/**
 * Evil - anti-pattern
 */
public class PropertyInjectedController {

	public GreetingService greetingService;

	public String sayHello() {
		return greetingService.sayHello();
	}



}
