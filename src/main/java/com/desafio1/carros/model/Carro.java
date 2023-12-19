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

    private Long chassis_id;
    private String model;
    private String brand;
    private String color;
    private String fabricationYear;

    private Boolean ativo;

    public Carro(DadosRegistroCarro dados) {
        this.ativo = true;
        this.chassis_id = dados.chassis_id();
        this.model = dados.model();
        this.brand = dados.brand();
        this.color = dados.color();
        this.fabricationYear = dados.fabricationYear();

    }
}
