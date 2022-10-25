package com.attra.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attra.rest.webservices.restfulwebservices.user.User;

public interface UserRespository extends JpaRepository<User, Integer> {

}
