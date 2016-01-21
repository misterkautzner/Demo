package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
public class DemoController {
	
	@RequestMapping(path = "/")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@RequestMapping(path = "/person")
	public String helloPerson() {
		PersonService personService = new PersonService();
		Person person = personService.getPerson();
		return person.getFirstName() + " " + person.getLastName();
	}

}
