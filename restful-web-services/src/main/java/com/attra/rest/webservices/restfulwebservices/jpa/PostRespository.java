package com.attra.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attra.rest.webservices.restfulwebservices.user.Post;

public interface PostRespository extends JpaRepository<Post, Integer> {

}
