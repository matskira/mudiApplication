package br.com.alura.mvc.mudi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public class PedidosDAO {

	@PersistenceContext
	private EntityManager entityMananger;
	
	public List<Pedido> consultaTodosPedidos(){
		Query query = entityMananger.createQuery("select p from Pedido p", Pedido.class);
		List<Pedido> pedidos = query.getResultList();
		return pedidos;
	}
}
