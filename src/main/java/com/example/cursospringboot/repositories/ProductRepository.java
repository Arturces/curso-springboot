package com.example.cursospringboot.repositories;

import com.example.cursospringboot.entities.Category;
import com.example.cursospringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Repository herda do JPARepository a dependencia como um componente do Spring.
public interface ProductRepository extends JpaRepository<Product, Long> {

}
