package com.example.demo.service.exception;

public class DuplicateIsbnException extends Exception {

    public DuplicateIsbnException(String message) {
        super(message);
    }
}