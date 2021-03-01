package de.kaffeemann.jpm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	PersonRepository personRepository;

	public Person addPerson(Person person) {
		return personRepository.save(person);
	}
	
	public List<Person> getAll() {
		return personRepository.findAll();
	}
}