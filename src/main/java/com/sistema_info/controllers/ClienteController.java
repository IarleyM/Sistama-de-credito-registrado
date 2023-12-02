package com.sistema_info.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema_info.dao.ClienteDao;
import com.sistema_info.entities.Usuario;
import com.sistema_info.services.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public List<Usuario> findAll(){
		return clienteService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public ClienteDao findById(@PathVariable Long id) {
		return clienteService.findById(id);
	}
}
