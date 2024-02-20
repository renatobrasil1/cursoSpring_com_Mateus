package com.remedios.brasil.curso.cursomateus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remedios.brasil.curso.remedio.DadosCadastroRemedio;
import com.remedios.brasil.curso.remedio.Remedio;
import com.remedios.brasil.curso.remedio.RemedioRepository;




@RestController
@RequestMapping("/remedios")

public class RemedioController {
	
	@Autowired
	private RemedioRepository repository;
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroRemedio dados) {
		
		repository.save(new Remedio(dados));
	}

}
