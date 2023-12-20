package com.desafio1.carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio1.carros.model.Carro;

@Repository
public interface CarrosRepository extends JpaRepository<Carro, Long>{

}
