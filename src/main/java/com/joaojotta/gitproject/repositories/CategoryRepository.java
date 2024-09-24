package com.joaojotta.gitproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaojotta.gitproject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
		
}
