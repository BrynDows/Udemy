package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.app.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Integer> {

}
