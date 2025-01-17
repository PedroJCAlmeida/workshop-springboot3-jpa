package com.estudopedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudopedro.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
