package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping // pega informação do método e exibe
	public String hello() {
		return "Hello World! Seja, bem vindos ao Spring!";
	}	
		 @GetMapping ("/bsm")
		    public String bsm() {
		        return "Comunicação, Mentalidade de crescimento, Orientação ao detalhe, Orientação ao Futuro, Persistência, Proatividade, Responsabilidade Pessoal Trabalho em Equipe";
		 }
		        @GetMapping ("/objetivos")
			    public String objetivos() {
			        return "Realização de tarefas, persistência, foco e determinação.";
	}
}
