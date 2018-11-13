package pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	public static final String SAY_HELLO = "Hello Drake Programmer";

	@Override
	public String sayHello() {
		return SAY_HELLO;
	}
}
