package br.com.alura.mvc.mudi.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//Representa que esta classe é um Controller
@Controller
public class HelloController {
	
	//Requisição para chamarmos a action como get para buscar nossa view html
	@GetMapping("/hello")
	public String hello( HttpServletRequest request) {
		request.setAttribute("name", "World");
		return "hello";
	}

}