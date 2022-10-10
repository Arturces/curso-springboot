package com.example.cursospringboot.repositories;

import com.example.cursospringboot.entities.OrderItem;
import com.example.cursospringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Repository herda do JPARepository a dependencia como um componente do Spring.
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
