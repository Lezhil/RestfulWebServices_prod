package com.techjava.learn.service;

import java.util.List;

import com.techjava.learn.entity.Person;

public interface PeopleService {
	
			List<Person>findAllPeople();
			Person findById(long id);
			Person insert(Person p);
			boolean delete(long id);
			boolean update(Person p);
				

}
