package de.kaffeemann.jpm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.kaffeemann.jpm.control.JPMService;

@RestController
@RequestMapping("")
public class JPMController {

	private static final Logger LOGGER = LoggerFactory.getLogger(JPMController.class);

	private JPMService jpmService;

	@Autowired
	JPMController(JPMService jpmService) {
		this.jpmService = jpmService;
	}

	@GetMapping(value = "/", produces = { "application/json" })
	public ResponseEntity<String> getCredentials() {
		LOGGER.info(JPMService.class.getEnclosingMethod().getName());
		return ResponseEntity.status(HttpStatus.OK).body(jpmService.get());
	}

}
