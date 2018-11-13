package pl.drakeprogrammer.section_03_di_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers.ConstructorInjectedSpringController;
import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers.MyController;
import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers.PropertyInjectedSpringController;
import pl.drakeprogrammer.section_03_di_demo.lessons_32_to_37.controllers.SetterInjectedSpringController;

@SpringBootApplication
public class Section03DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Section03DiDemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();

		System.out.println(ctx.getBean(PropertyInjectedSpringController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedSpringController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedSpringController.class).sayHello());
	}
}
