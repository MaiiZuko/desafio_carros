package com.desafio1.carros.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio1.carros.model.Carro;

public interface CarrosRepository extends JpaRepository<Carro, Long>{

    Page<Carro> findAllByAtivoTrue(Pageable paginacao);

}
