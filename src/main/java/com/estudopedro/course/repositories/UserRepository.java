package com.estudopedro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudopedro.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
