package com.example.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestParam;

public class ServletInitializer extends SpringBootServletInitializer {

	 public String saludos(@RequestParam(required = false, defaultValue = "") String nombre) {
	        return "".equals(nombre) ? "Hola Mundo!" : "Hola " + nombre;
	    }

}
