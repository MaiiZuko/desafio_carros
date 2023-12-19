package com.desafio1.carros.dto.carro;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosRegistroCarro(
    

    Long chassis_id,

    @NotBlank
    String model,

    @NotNull
    String brand,

    @NotBlank
    String color,

    @NotBlank
    String fabricationYear) {

}
