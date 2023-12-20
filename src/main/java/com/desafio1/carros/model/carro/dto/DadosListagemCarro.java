package com.desafio1.carros.model.carro.dto;

import com.desafio1.carros.model.Carro;

public record DadosListagemCarro(Long chassis_id, String brand, String model, String color, String fabrication_year) {

    public DadosListagemCarro(Carro carro) {
        this(carro.getChassis_id(), carro.getBrand(), carro.getModel(), carro.getColor(), carro.getFabrication_year().toString());
    }
}
