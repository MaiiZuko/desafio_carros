package com.desafio1.carros.model;

import com.desafio1.carros.model.carro.dto.DadosRegistroCarro;

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

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "chassis_id")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chassis_id;

    private String model;
    
    private String brand;

    private String color;

    private String fabrication_year;

    public Carro(DadosRegistroCarro dados) {
        this.model = dados.model();
        this.brand = dados.brand();
        this.color = dados.color();
        this.fabrication_year = dados.fabrication_year();

    }
}