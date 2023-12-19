package com.desafio1.carros.dto.carro;

import com.desafio1.carros.model.Carro;

public record DadosListagemCarro(Long id, Long chassis_id, String brand, String model, String color, String fabricationYear, Boolean ativo) {

    public DadosListagemCarro(Carro carro) {
        this(carro.getId(), carro.getChassis_id(), carro.getBrand(), carro.getModel(), carro.getColor(), carro.getFabricationYear().toString(), carro.getAtivo());
    }
}
