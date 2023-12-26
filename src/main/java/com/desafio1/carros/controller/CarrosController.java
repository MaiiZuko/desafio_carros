package com.desafio1.carros.controller;

import org.springframework.web.bind.annotation.RestController;

import com.desafio1.carros.model.Carro;
import com.desafio1.carros.model.carro.dto.DadosListagemCarro;
import com.desafio1.carros.model.carro.dto.DadosRegistroCarro;
import com.desafio1.carros.repository.CarrosRepository;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/carros")
public class CarrosController {

    @Autowired
    private CarrosRepository repository;

    @PostMapping
    @Transactional
    @ResponseStatus(HttpStatus.CREATED)
    public void registrar(@RequestBody @Valid DadosRegistroCarro dados){
        repository.save(new Carro(dados));
    }
    @GetMapping //carrega apenas 10 registros e ordena pelo nome
    public Page<DadosListagemCarro> listar(@PageableDefault(size = 10, sort = {"brand"}) Pageable paginacao) { 
        return repository.findAll(paginacao).map(DadosListagemCarro::new);
    }

}
