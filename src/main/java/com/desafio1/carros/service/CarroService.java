package com.desafio1.carros.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.desafio1.carros.infra.exception.CarroNotFoundException;
import com.desafio1.carros.model.Carro;
import com.desafio1.carros.model.carro.dto.DadosListagemCarro;
import com.desafio1.carros.model.carro.dto.DadosRegistroCarro;
import com.desafio1.carros.repository.CarrosRepository;

public class CarroService {

    private final CarrosRepository carrosRepository;
    private final CarroDTO carroDTO;

    @Autowired
    public CarroService(CarrosRepository carrosRepository, CarroDTO carroDTO) {
        this.carrosRepository = carrosRepository;
        this.carroDTO = carroDTO;
    }

    public DadosListagemCarro create(DadosRegistroCarro dadosRegistroCarro) {
        var carro = carroDTO.toModel(dadosRegistroCarro);
        var carroSave = carrosRepository.save(carro);
        return carroDTO.toDadosListagemCarro(carroSave);
    }

    public DadosListagemCarro findBy(Long id) {
        var carro = fetchOrFail(id);
        return carroDTO.toDadosListagemCarro(carro);
    }

    private Carro fetchOrFail(Long id) {
        return carrosRepository.findById(id).orElseThrow(CarroNotFoundException::new);
    }
}
