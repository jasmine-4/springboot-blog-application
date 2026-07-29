package com.jasmine.blogapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasmine.blogapplication.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
