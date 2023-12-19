package com.desafio1.carros.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/carros")
public class CarrosController {

    @Autowired
    private CarrosRepository repository;

    @PostMapping
    @Transactional
    public void registrar(@RequestBody DadosRegistroCarro dados){
        repository.save(new Carro(dados));
    }

}
