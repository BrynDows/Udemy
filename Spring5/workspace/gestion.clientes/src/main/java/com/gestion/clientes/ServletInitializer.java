package com.gestion.clientes;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/** Esta clase se usa para aquellos proyectos que van a ser empaquetado como .WAR, es decir, un proyecto con estructura
 * web, esta clase desencadena el inicio del servidor embebdio TOMCAT. Un proyecto JSP hace uso de una estructura WEB y debe
 * ser empaquetado como .WAR, sin embargo un proyecto Thymeleaf puede ser empaquetado coo .WAR  o .JAR
 * @author bgtiban
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

}

