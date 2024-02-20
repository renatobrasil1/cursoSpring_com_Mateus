package com.remedios.brasil.curso.cursomateus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/hello")
public class HelloWorld {
	
	@GetMapping
	public String olaMundo() {
		
		return "Hello word estou aprendendo";
		
	}

}
