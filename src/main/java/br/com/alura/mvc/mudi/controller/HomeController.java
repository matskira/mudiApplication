package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.alura.mvc.mudi.dao.PedidosDAO;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.model.StatusPedido;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private PedidosDAO dao;
	
	
	@GetMapping("")
	public ModelAndView home() {
		List<Pedido> pedidos = dao.findAll();
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("listaPedidos", pedidos);
		return mv;
	}
	
	@GetMapping("/{status}")
	public ModelAndView porStatus(@PathVariable("status") String status) {
		List<Pedido> pedidos = dao.findByStatus(StatusPedido.valueOf(status.toUpperCase()));
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("listaPedidos", pedidos);
		mv.addObject("status", status);
		return mv;
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String onError() {
		return "redirect:/home";
	}
}
