package com.example.cursospringboot.services.exceptions;


public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3816654993081162174L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
