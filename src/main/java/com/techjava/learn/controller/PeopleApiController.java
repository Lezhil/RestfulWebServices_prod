package com.techjava.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techjava.learn.entity.Person;
import com.techjava.learn.service.PeopleService;

@RestController
@RequestMapping("/api/people")
public class PeopleApiController {
				
				@Autowired
				PeopleService ppsl;
				
				@GetMapping("")
				public List<Person>getAllPeople(){
					
					return ppsl.findAllPeople();
				}
				
				@GetMapping("{id}")
				public Person getPerson(@PathVariable long id) {
					
					return ppsl.findById(id);
				}
				
				@PostMapping("")
				public String addPerson(@RequestBody Person person) {
					
					if(person!=null) {
						
						ppsl.insert(person);
						return "Adding a Person";
					}else {
							return "Request doesn't contain a body";
					}
				}
				
				@DeleteMapping("{id}")
				public String deletePerson(@PathVariable("id") long id) {
					
					if(id>0) {
						
							if(ppsl.delete(id)) {
								
								return "Deleted the Person";
							}else {
								return "Connot delete the Person";
							}
							
					}
					return "The id is invalid for the person.";
				}
				
				
				@PutMapping("")
				public String updatePerson(@RequestBody Person person) {
					
					if(person!=null) {
						ppsl.update(person);
						return "Updated Person";
					}else {
						return "Request does not contain a body";
					}
					
				}
				
				
				
}
