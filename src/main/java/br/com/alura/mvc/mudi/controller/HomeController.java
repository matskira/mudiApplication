package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.alura.mvc.mudi.dao.PedidosDAO;
import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@Autowired
	private PedidosDAO dao;
	
	
	@GetMapping("/home")
	public ModelAndView home() {
		List<Pedido> pedidos = dao.findAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("listaPedidos", pedidos);
		return mv;
	}
}
