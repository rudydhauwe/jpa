package com.switchfully.jpa.repository;

import com.switchfully.jpa.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
