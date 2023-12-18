package com.switchfully.jpa;

import com.switchfully.jpa.domain.Person;
import com.switchfully.jpa.repository.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JpaApplication.class, args);
		PersonRepository repository = ctx.getBean(PersonRepository.class);
		System.out.println(repository);
		List<Person> all = repository.findAll();
		System.out.println(all.size());
		Person max = new Person();
		max.setName("Max");
		max = repository.save(max);
		System.out.println(max.getId());
	}
}
