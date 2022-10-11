package com.example.cursospringboot.services.exceptions;



public class DatabaseException extends RuntimeException {

    private static final long serialVersionUID = 990516784150498384L;

    public DatabaseException(String msg){
        super(msg);
    }
}
