package com.desafio1.carros.dto.carro;

import com.desafio1.carros.model.Carro;

public record DadosListagemCarro(Long id, String chassis_id, String marca, String modelo, String cor, String ano, Boolean ativo) {

    public DadosListagemCarro(Carro carro) {
        this(carro.getId(), carro.getChassis_id(), carro.getMarca(), carro.getModelo(), carro.getCor(), carro.getAno().toString(), carro.getAtivo());
    }
}
