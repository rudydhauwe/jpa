package com.switchfully.jpa;

import com.switchfully.jpa.domain.Person;
import com.switchfully.jpa.repository.PersonRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureTestDatabase
class JpaApplicationTests {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private EntityManager entityManager;

	@Test
	void contextLoads() {
		assertNotNull(personRepository);
		assertNotNull(entityManager);
	}

	@Test
	void createPerson() {
		Person person = new Person();
		person.setName("Max");
		person = personRepository.save(person);
		assertNotNull(person.getId());

		Long id = person.getId();

		Person max = entityManager.find(Person.class, id);
		assertEquals("Max", max.getName());
	}
}
