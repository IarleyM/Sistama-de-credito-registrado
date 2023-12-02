package com.sistema_info.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_info.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
	
	
}
