package com.gestion.clientes.model.dao;

import java.util.List;

import com.gestion.clientes.model.entity.Producto;

public interface IProductoDao {

	public List<Producto> listar();
	
	public void insertarActualizar(Producto Producto);
	
	public void eliminar(Long Producto);

	Producto listarUno(long id);
}
