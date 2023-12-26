package com.desafio1.carros.model.carro.dto;

import com.desafio1.carros.model.Brand;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosRegistroCarro(

    @NotBlank
    String model,

    @NotNull
    Brand brand,

    @NotBlank
    String color,

    @NotBlank
    String fabrication_year) {

}
