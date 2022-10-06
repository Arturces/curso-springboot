package com.example.cursospringboot.resources;

import com.example.cursospringboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    //Controlador REST que responde no caminho USERS
    //Metodo EndPoint para acessar os usuarios na camada REST
    //Response entities, metodo que retornar respostas de requisições WEB
    //Metodo retornando um GENERICS <>
    //Indicando que é um metodo que responde a requisição tipo GET do HTTP

    //annotations
    @GetMapping
    public ResponseEntity<User> procurarTodos() {
        User u = new User(1L, "Artur", "artur@gmail.com", "73988160180", "12345");
        return ResponseEntity.ok().body(u);
    }


}
