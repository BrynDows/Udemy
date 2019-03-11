/**
 * 
 */
package com.gestion.clientes.model.dao;

import java.util.List;
import com.gestion.clientes.model.entity.Cliente;

/** Clase que contiene el CRUD de la clase
 * 
 * @author bgtiban */
public interface IClienteDao {

	public List<Cliente> listar();
	
	public void insertarActualizar(Cliente cliente);
	
	public void eliminar(Cliente cliente);

	Cliente listarUno(long id);
}
