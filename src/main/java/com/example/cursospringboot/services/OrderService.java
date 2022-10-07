package com.example.cursospringboot.services;

import com.example.cursospringboot.entities.Order;
import com.example.cursospringboot.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component //registra a sua classe como um componente do Spring
@Service
public class OrderService {

    @Autowired//infejeção de dependencia do Service para a classe Controller
    private OrderRepository repository;

    public List<Order> findAll(){ //buscar todos os users, exemplo de endPoints
        return repository.findAll();
    }

    public Order findById(Long id){
       Optional<Order> obj = repository.findById(id); //Retorna um Optional com o valor fornecido
       return obj.get();
    }

}
