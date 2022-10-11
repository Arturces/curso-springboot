package com.example.cursospringboot.resources;

import com.example.cursospringboot.entities.User;
import com.example.cursospringboot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController //Annotation controlador especial usado para serviços RESTFul
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired//injeção automatica da depedencia para o service
    private UserService service;

    //Controlador REST que responde no caminho USERS
    //Metodo EndPoint para acessar os usuarios na camada REST
    //Response entities, metodo que retornar respostas de requisições WEB
    //Metodo retornando um GENERICS <>
    //Indicando que é um metodo que responde a requisição tipo GET do HTTP

    //annotations
    @GetMapping //requisição tipo GET
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}") //exemplo de endPoints par abuscar pelo ID do usuario, {1} /user/1 ele faz a busca pelo ID
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping //Inserindo um recurso no banco de dados
    public ResponseEntity<User> insert(@RequestBody User obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }



}
