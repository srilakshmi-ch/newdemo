package com.example.prime.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;
	  private String gender;
	  private String name;
	  
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User(Long id,String gender, String name) {
		this.id = id;
		this.gender = gender;
		this.name = name;
	}
	
	public String toString() {
		return this.name + " " + this.gender;
	}
	public User() {
		super();
	}
	
	  
}
