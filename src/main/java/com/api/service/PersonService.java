package com.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.api.model.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();

	public Person create(Person person) {
		return person;
	}

	public Person update(Person person) {
		return person;
	}

	public boolean delete(String id) {
		return true;
	}

	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Luciano");
		person.setLastName("de Paula");
		person.setAddress("Betim - MG - Brasil");
		person.setGender("Male");
		return person;
	}

	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();

		for (int i = 0; i < 7; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}

		return persons;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("last name " + i);
		person.setAddress("Some address in Brazil " + i);
		person.setGender("Male " + i);
		return person;
	}
}
