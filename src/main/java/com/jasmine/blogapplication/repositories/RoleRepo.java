package com.jasmine.blogapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasmine.blogapplication.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
