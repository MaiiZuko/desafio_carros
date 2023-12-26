package com.desafio1.carros.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.desafio1.carros.model.Carro;
import com.desafio1.carros.model.carro.dto.DadosListagemCarro;
import com.desafio1.carros.model.carro.dto.DadosRegistroCarro;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CarroDTO {
    
    @Autowired
    private final ModelMapper modelMapper;

    public DadosListagemCarro toDadosListagemCarro(Carro carro){
        return modelMapper.map(carro, DadosListagemCarro.class);
    }

    public Carro toModel(DadosRegistroCarro dadosRegistroCarro){
        return modelMapper.map(dadosRegistroCarro, Carro.class);
    } 
}
