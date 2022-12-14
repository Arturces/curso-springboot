package com.example.cursospringboot.resources;

import com.example.cursospringboot.entities.Category;
import com.example.cursospringboot.entities.User;
import com.example.cursospringboot.services.CategoryService;
import com.example.cursospringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Annotation controlador especial usado para serviços RESTFul
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired//injeção automatica da depedencia para o service
    private CategoryService service;

    //Controlador REST que responde no caminho USERS
    //Metodo EndPoint para acessar os usuarios na camada REST
    //Response entities, metodo que retornar respostas de requisições WEB
    //Metodo retornando um GENERICS <>
    //Indicando que é um metodo que responde a requisição tipo GET do HTTP

    //annotations
    @GetMapping //requisição tipo GET
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}") //exemplo de endPoints
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }



}
