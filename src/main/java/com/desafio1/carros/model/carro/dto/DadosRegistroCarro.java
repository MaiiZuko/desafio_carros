package com.desafio1.carros.model.carro.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosRegistroCarro(

    @NotBlank
    String model,

    @NotNull
    String brand,

    @NotBlank
    String color,

    @NotBlank
    String fabrication_year) {

}
