package br.com.alura.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.mock.PedidoMock;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("listaPedidos", PedidoMock.mockaPedido());
		
		
		return "home";
	}
}
