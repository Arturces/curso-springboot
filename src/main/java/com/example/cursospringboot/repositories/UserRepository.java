package com.example.cursospringboot.repositories;

import com.example.cursospringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
