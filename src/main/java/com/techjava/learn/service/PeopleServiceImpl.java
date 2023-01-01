package com.techjava.learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techjava.learn.entity.Person;
import com.techjava.learn.repo.PersonRepository;

@Service
public class PeopleServiceImpl implements PeopleService {
	
	@Autowired
	private PersonRepository personRepo;

	public List<Person> findAllPeople() {
		
		return (List<Person>)personRepo.findAll();
	}

	public Person findById(long id) {
		Optional<Person> result = personRepo.findById(id);
		
		if(result.isPresent()) {
			return result.get();
		}else {
		return null;
		}
	}

	public Person insert(Person p) {
		
		return personRepo.save(p);
	}

	public boolean delete(long id) {
		try {
			personRepo.deleteById(id);
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		return false;
		}
	}

	public boolean update(Person p) {
		try {
			personRepo.save(p);
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		
	}

}
