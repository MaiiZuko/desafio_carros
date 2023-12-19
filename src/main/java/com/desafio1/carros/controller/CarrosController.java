package com.desafio1.carros.controller;

import org.springframework.web.bind.annotation.RestController;

import com.desafio1.carros.model.Carro;
import com.desafio1.carros.repository.CarrosRepository;
import com.desafio1.carros.dto.carro.DadosListagemCarro;
import com.desafio1.carros.dto.carro.DadosRegistroCarro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
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
    @GetMapping //carrega apenas 10 registros e ordena pelo nome
    public Page<DadosListagemCarro> listar(@PageableDefault(size = 10, sort = {"marca"}) Pageable paginacao) { //agora podemos controlar por exemplo: http://localhost:8080/medicos?size=1 - mostra só um médico na lista - http://localhost:8080/medicos?size=1&page=2 vai trocando a pagina
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemCarro::new);// Fazendo em paginação

    }

}
