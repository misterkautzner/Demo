package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.Person;

@Service
public class PersonService {
	public Person getPerson() {
		Person john = new Person();
		john.setFirstName("John");
		john.setLastName("Kautzner");
		
		return john;
	}
}
