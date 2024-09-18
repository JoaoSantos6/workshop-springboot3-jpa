package com.joaojotta.gitproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaojotta.gitproject.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
}
