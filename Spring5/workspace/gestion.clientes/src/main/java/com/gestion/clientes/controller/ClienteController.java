/**
 * 
 */
package com.gestion.clientes.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestion.clientes.model.dao.IClienteDao;
import com.gestion.clientes.model.entity.Cliente;

/** @author bgtiban */
@Controller // calse controladora
public class ClienteController {

	/*
	 * Buscará la/las clases que implementen la interfaz y esten anotadas
	 * con @Repository
	 */
	@Autowired
	/* se indica aquel @Repository con nombre ClienteJPA */
	// @Qualifier("ClienteJPA")
	private IClienteDao clienteDao;

	// @Value("${IndexContronller.titulo}")
	// private String titulo;

	// @GetMapping("/") // esta es la URL
	@RequestMapping(value = "/listar", method = RequestMethod.GET) // Acción
																	// Listar
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado Clientes");
		model.addAttribute("clientes", clienteDao.listar());

		return "/listar"; // Se indica la vista a mostrar.
	}

	@GetMapping(value = { "/", "/formulario" })
	public String formulario(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("Cliente", cliente);
		model.addAttribute("titulo", "Alta Nuevo Cliente");

		return "/formulario";
	}

	@PostMapping(value = "/insertar")
	public String guardar(@Valid Cliente cliente, BindingResult result) {
		String pantalla = "/formulario";
		if (!result.hasErrors()) {
			clienteDao.insertarActualizar(cliente);
			pantalla = "redirect:/listar";
		}
		return pantalla;
	}

	@GetMapping(value = "/formulario/{id}")
	public String editar(@PathVariable("id") long id, Model model) {
		String pantalla = "redirect:/listar";

		if (id > 0) {
			Cliente cliente = clienteDao.listarUno(id);
			model.addAttribute("Cliente", cliente);
			model.addAttribute("titulo", "Editar Cliente");
			pantalla = "/formulario";
		}

		return pantalla;
	}
	
	@GetMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable("id") long id) {
		String pantalla = "redirect:/listar";
		
		if(id>0) {
			clienteDao.eliminar(id);
		}
		
		return pantalla;
	}

}
