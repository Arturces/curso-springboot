package com.example.cursospringboot.services;

import com.example.cursospringboot.entities.User;
import com.example.cursospringboot.repositories.UserRepository;
import com.example.cursospringboot.services.exceptions.DatabaseException;
import com.example.cursospringboot.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
       Optional<User> obj = repository.findById(id); //Retorna um Optional com o valor fornecido, ja retornar o OBJ do banco
       return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
       return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw  new ResourceNotFoundException(id);//ver o tipo de excecao lançada
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){
        User entity = repository.getOne(id);//prepara o objeto monitorado, somente pra vc mexer e depois alterar no banco
        updateData(entity,obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
