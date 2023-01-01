package com.techjava.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techjava.learn.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{

}
