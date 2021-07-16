package br.com.alura.mvc.mudi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.Pedido;

@Repository
public interface PedidosDAO extends JpaRepository<Pedido, Long>{
}
