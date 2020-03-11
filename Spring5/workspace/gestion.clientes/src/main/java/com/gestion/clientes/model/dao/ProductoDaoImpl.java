package com.gestion.clientes.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.gestion.clientes.model.entity.Producto;

public class ProductoDaoImpl implements IProductoDao {

	
	@PersistenceContext
	private EntityManager terminal;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly = true)
	public List<Producto> listar() {
		return terminal.createQuery("from productos").getResultList();
	}

	@Override
	@Transactional
	public void insertarActualizar(Producto producto) {
		if(producto.getId() > 0) {
			terminal.merge(producto);
		} else {
			terminal.persist(producto);
		}
	}

	@Override
	public void eliminar(Long producto) {

	}

	@Override
	public Producto listarUno(long id) {

		return null;
	}

}
