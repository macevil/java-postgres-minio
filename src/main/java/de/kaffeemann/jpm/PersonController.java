package de.kaffeemann.jpm;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	Logger logger = LoggerFactory.getLogger(PersonController.class);

	private PersonService personService;

	@Autowired
	PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping(path = "/getAll", produces = { "application/json" })
	public ResponseEntity<List<Person>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(this.personService.getAll());
	}

}