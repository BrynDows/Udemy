package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Empleado;

public interface IEmpleadoService {

	public List<Empleado> findAll();

	public void save(Empleado Empleado);
	
	public Empleado findOne(int id);
	
	public void delete(int id);
}
