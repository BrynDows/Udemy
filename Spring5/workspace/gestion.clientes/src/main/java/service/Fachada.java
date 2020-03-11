package service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.clientes.model.dao.IClienteDao;
import com.gestion.clientes.model.entity.Cliente;

@Service
public class Fachada implements IClienteDao {

	@Override
	public List<Cliente> listar() {
		return null;
	}

	@Override
	public void insertarActualizar(Cliente cliente) {

	}

	@Override
	public void eliminar(Long cliente) {

	}

	@Override
	public Cliente listarUno(long id) {
		return null;
	}

}
