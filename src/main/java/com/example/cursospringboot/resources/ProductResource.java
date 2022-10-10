package com.example.cursospringboot.resources;

import com.example.cursospringboot.entities.Product;
import com.example.cursospringboot.entities.User;
import com.example.cursospringboot.services.ProductService;
import com.example.cursospringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //Annotation controlador especial usado para serviços RESTFul
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired//injeção automatica da depedencia para o service
    private ProductService service;

    //Controlador REST que responde no caminho USERS
    //Metodo EndPoint para acessar os usuarios na camada REST
    //Response entities, metodo que retornar respostas de requisições WEB
    //Metodo retornando um GENERICS <>
    //Indicando que é um metodo que responde a requisição tipo GET do HTTP

    //annotations
    @GetMapping //requisição tipo GET
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}") //exemplo de endPoints
    public ResponseEntity<Product> findById(@PathVariable Long id){
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }



}
