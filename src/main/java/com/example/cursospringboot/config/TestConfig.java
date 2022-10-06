package com.example.cursospringboot.config;

import com.example.cursospringboot.entities.User;
import com.example.cursospringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

//Classe para instanciar o banco de dados com os usuarios

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired //Resolvendo a depedencia e associando a instancia do userRepository no testconfig
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        //salvar no banco do dedados
        userRepository.saveAll(Arrays.asList(u1, u2));

    }
}

