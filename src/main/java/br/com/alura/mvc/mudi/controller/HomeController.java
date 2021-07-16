package br.com.alura.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.dao.PedidosDAO;

@Controller
public class HomeController {

	@Autowired
	private PedidosDAO dao;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("listaPedidos", dao.findAll());
		return "home";
	}
}
