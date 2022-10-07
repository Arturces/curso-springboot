package com.example.cursospringboot.repositories;

import com.example.cursospringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Repository herda do JPARepository a dependencia como um componente do Spring.
public interface OrderRepository extends JpaRepository<Order, Long> {

}
