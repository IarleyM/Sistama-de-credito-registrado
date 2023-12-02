package com.sistema_info.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sistema_info.dao.ClienteDao;
import com.sistema_info.entities.Usuario;
import com.sistema_info.repositories.UsuarioRepositorio;


@Service
public class ClienteService {

	@Autowired
	UsuarioRepositorio usuarioRepositorio;
	
	@Transactional(readOnly = true)
	public List<Usuario> findAll(){
		return usuarioRepositorio.findAll();
	}
	
	@Transactional(readOnly = true)
	public ClienteDao findById(Long id) {
		Usuario usuario = usuarioRepositorio.findById(id).get();
		ClienteDao dao = new ClienteDao(usuario);
		return dao;
	}
}
