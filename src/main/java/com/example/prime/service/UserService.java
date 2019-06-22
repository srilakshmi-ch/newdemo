package com.example.prime.service;

import java.util.Optional;

import com.example.prime.entity.User;

public interface UserService {
	User create(User user);
	User retrieveByName(String name);
	User retrieveByNameAndGender(String name, String gender);

	User update(User user);
	void deleteByName(String name);
	Optional<User> findById(Long id);
}
