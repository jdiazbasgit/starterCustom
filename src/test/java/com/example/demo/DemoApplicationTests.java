package com.example.demo;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controladores.HomeController;

import curso.allianz.concierto.musicos.HombreOrquesta;
import lombok.Data;

@SpringBootTest
@RunWith(SpringRunner.class)
@Data

public class DemoApplicationTests {
	
	@Autowired
	private HomeController controller;

	@Test
	public void contextLoads() {
		assertNotNull(getController().home());
		
	}

}
