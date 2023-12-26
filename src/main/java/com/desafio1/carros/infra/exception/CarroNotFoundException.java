package com.desafio1.carros.infra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarroNotFoundException extends RuntimeException {

    public CarroNotFoundException() {
        super("Carro não encontrado");
    }

    public CarroNotFoundException(String message) {
        super(message);
    }

    public CarroNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
