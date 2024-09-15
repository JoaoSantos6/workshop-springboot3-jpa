package com.joaojotta.gitproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaojotta.gitproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
		
}
