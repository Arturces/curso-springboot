package com.example.cursospringboot.services;

import com.example.cursospringboot.entities.User;
import com.example.cursospringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component //registra a sua classe como um componente do Spring
@Service
public class  UserService {

    @Autowired//infejeção de dependencia do Service para a classe Controller
    private UserRepository repository;

    public List<User> findAll(){ //buscar todos os users, exemplo de endPoints
        return repository.findAll();
    }

    public User findById(Long id){
       Optional<User> obj = repository.findById(id); //Retorna um Optional com o valor fornecido
       return obj.get();
    }

    public User insert(User obj){
       return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
