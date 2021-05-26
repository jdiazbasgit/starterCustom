package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import curso.allianz.concierto.springbootstarter.service.AllianzConciertoService;
import lombok.Data;

@RestController
@Data
public class HomeController {

	@Autowired
	private AllianzConciertoService service;
	
	@GetMapping("/algo")
	public String home() {
		
		try {
			System.out.println("------------- SOLISTA -------------");
			getService().tocaSolista();
			System.out.println("------------- HOMBRE ORQUESTA -------------");
			getService().tocaHombreOrquesta();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
		}
		
		return "home";

	}

}
