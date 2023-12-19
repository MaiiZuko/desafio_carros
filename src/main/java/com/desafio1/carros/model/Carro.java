package com.desafio1.carros.model;

import com.desafio1.carros.dto.carro.DadosRegistroCarro;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "carros")
@Entity(name = "Carro")
@Getter
@Setter
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

    private Boolean ativo;

    public Carro(DadosRegistroCarro dados) {
        this.ativo = true;
        this.chassis_id = dados.chassis_id();
        this.modelo = dados.modelo();
        this.marca = dados.marca();
        this.cor = dados.cor();
        this.ano = dados.ano();

    }
}
