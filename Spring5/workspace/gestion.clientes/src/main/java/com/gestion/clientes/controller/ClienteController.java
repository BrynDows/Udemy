/**
 * 
 */
package com.gestion.clientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gestion.clientes.model.dao.IClienteDao;

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
	@RequestMapping(value = "/listar", method = RequestMethod.GET) // Acción Listar
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado CLientes");
		model.addAttribute("clientes", clienteDao.listar());
		return "listar"; // Se indica la vista a mostrar.
	}

}
