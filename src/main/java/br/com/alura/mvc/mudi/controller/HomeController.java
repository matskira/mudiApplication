package br.com.alura.mvc.mudi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.dao.PedidosDAO;
import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@Autowired
	private PedidosDAO dao;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("listaPedidos", dao.consultaTodosPedidos());
		return "home";
	}
}
