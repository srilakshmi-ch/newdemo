package com.example.prime.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.prime.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{
   User findByName(String name);
   User findByNameAndGender(String name, String gender);
   @Query("select user from User user where user.name =?1")
   User userByName(String name);
   
   @Query("select user from User user where user.name =:username and user.gender =:gender")
   User userByNameAndGender(@Param("username") String name,@Param("gender") String gender);

}
