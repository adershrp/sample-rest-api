package com.rate.limitter.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/sample", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class SampleRestController {

	@GetMapping("/first-api")
	public ResponseEntity<?> firstMethod() {
		return ResponseEntity.ok().body("/first-api Success!");
	}

	@GetMapping("/second-api")
	public ResponseEntity<?> secondMethod() {
		return ResponseEntity.ok().body("/second-api Success!");
	}

}
