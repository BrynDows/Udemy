package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bolsadeideas.springboot.app.models.dao.IEmpleadoDao;
import com.bolsadeideas.springboot.app.models.entity.Empleado;

public class EmpleadoServiceImpl implements IEmpleadoService {
	
	@Autowired
	IEmpleadoDao dao;

	@Override
	public List<Empleado> findAll() {
		return (List<Empleado>) dao.findAll();
	}

	@Override
	public void save(Empleado empleado) {
		dao.save(empleado);
	}

	@Override
	public Empleado findOne(int id) {
		return dao.findOne(id);
	}

	@Override
	public void delete(int id) {
		Empleado empleado = null;
		empleado = dao.findOne(id);
		
		dao.delete(empleado);

	}

}
