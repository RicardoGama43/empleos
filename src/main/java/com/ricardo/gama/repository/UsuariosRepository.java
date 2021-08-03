package com.ricardo.gama.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ricardo.gama.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {
	
	//metodo personalizado con sql nativo
	@Query(value="select count(*) from usuarios", nativeQuery = true)
	Integer totalEntidades();
}
