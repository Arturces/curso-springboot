package com.example.cursospringboot.services;

import com.example.cursospringboot.entities.Category;
import com.example.cursospringboot.entities.User;
import com.example.cursospringboot.repositories.CategoryRepository;
import com.example.cursospringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component //registra a sua classe como um componente do Spring
@Service
public class CategoryService {

    @Autowired//infejeção de dependencia do Service para a classe Controller
    private CategoryRepository repository;

    public List<Category> findAll(){ //buscar todos os users, exemplo de endPoints
        return repository.findAll();
    }

    public Category findById(Long id){
       Optional<Category> obj = repository.findById(id); //Retorna um Optional com o valor fornecido
       return obj.get();
    }

}
