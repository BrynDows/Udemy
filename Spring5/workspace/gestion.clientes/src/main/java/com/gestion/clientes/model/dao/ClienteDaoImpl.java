/**
 * 
 */
package com.gestion.clientes.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.gestion.clientes.model.entity.Cliente;

/** Clase de acceso a datos
 * 
 * @author bgtiban */

/* es un estereotipo de la clase component y se indica que es un
 * componente de persistencia de acceso a datos */
@Repository("clienteJPA")
public class ClienteDaoImpl implements IClienteDao {

	@PersistenceContext
	private EntityManager terminal; // Clase de acceso a persistencia a datos

	/* (non-Javadoc)
	 * 
	 * @see com.gestion.clientes.model.dao.IClienteDao#selectAll() */

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> listar() {
		/* En la query se indica el nombre de la clase, ya que está mapeada */
		return terminal.createQuery("from Cliente").getResultList();
	}

}
