package com.desafio1.carros.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "carros")
@Entity(name = "Carro")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "chassis_id")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chassis_id;
    private String modelo;
    private String marca;
    private String cor;
    private String ano;

    public Carro(DadosRegistroCarro dados) {
        this.chassis_id = dados.chassis_id();
        this.modelo = dados.modelo();
        this.marca = dados.marca();
        this.cor = dados.cor();
        this.ano = dados.ano();

    }
}
