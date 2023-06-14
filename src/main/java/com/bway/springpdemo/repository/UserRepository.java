package com.bway.springpdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bway.springpdemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	 User  findByUsernameAndPassword(String un, String psw);
}
