package com.javainuse.dao;

import org.springframework.data.repository.CrudRepository;

import com.javainuse.model.DAOUser;

public interface UserDao extends CrudRepository<DAOUser, Integer>{
	DAOUser findByUsername(String username);
}