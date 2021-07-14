package br.com.alura.mvc.mudi.mock;


import java.util.Arrays;
import java.util.List;

import br.com.alura.mvc.mudi.model.Pedido;

public class PedidoMock {

	public static List<Pedido> mockaPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Fire TV Stick Lite");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51byTksGydS._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Novo_FireTVStick_Lite/dp/B07ZZW745X?ref_=Oct_otopr_d_16209062011&pd_rd_w=sDMAx&pf_rd_p=32b1ddde-8c67-4d85-bbf2-2754a91fdba5&pf_rd_r=JK6EZ2XTQ8HCW6KA2NRS&pd_rd_r=f5082579-8020-49d6-960f-78c0461e2656&pd_rd_wg=yMgFV&pd_rd_i=B07ZZW745X");
		pedido.setDescricao("Uma descrição qualquer");

		
		List<Pedido> listaPedidosMockado = Arrays.asList(pedido);
		
		return listaPedidosMockado;
	}
}
