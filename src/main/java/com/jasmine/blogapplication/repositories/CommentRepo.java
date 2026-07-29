package com.jasmine.blogapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasmine.blogapplication.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
