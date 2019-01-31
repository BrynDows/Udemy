/**
 * 
 */
package com.gestion.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gestion.clientes.model.dao.IClienteDao;
import com.gestion.clientes.model.entity.Cliente;

/** @author bgtiban */
@Controller // calse controladora
public class ClienteController {

	/* Buscará la/las clases que implementen la interfaz y esten anotadas
	 * con @Repository */
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

		return "listar"; // Se indica la vista a mostrar.
	}

	@GetMapping("formulario")
	public String formulario(Model model) {
		Cliente cliente = new Cliente();
		model.addAttribute("Cliente", cliente);
		model.addAttribute("titulo", "Alta Nuevo Cliente");

		return "/formulario";
	}

	@RequestMapping(value = "/insertar", method = RequestMethod.POST)
	public String insertar(Cliente cliente) {
		clienteDao.insertar(cliente);

		return "redirect:listar";
	}

}
