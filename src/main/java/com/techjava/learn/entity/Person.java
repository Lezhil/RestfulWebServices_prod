package com.techjava.learn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="people")
public class Person {
				
				@Id
				@GeneratedValue(strategy=GenerationType.AUTO)
				
				@Column(name="id")
				public Long id;
				
				@Column(name="name")
				public String name;
				
				@Column(name="role")
				public String role;
				
				/*public Person() {}

				*//**
				 * @param id
				 * @param name
				 * @param role
				 *//*
				public Person(Long id, String name, String role) {
					super();
					this.id = id;
					this.name = name;
					this.role = role;
				}

				@Override
				public String toString() {
					return "Person [id=" + id + ", name=" + name + ", role=" + role + "]";
					
					StringBuilder builder = new StringBuilder();
					
					builder.append(String.valueOf(id));
					builder.append(", ");
					builder.append(name);
					builder.append(", ");
					builder.append(role);
					builder.append(", ");
					
					return builder.toString();
				}
				
				*/
				
				
				
				

}
