package com.ricardo.gama.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardo.gama.model.Categoria;

public interface CategoriasRepository extends  JpaRepository<Categoria, Integer> {

}
