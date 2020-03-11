/**
 * 
 */
package com.gestion.clientes.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


/**Clase que corresponde con la tabla PRODUCTOS
 * @author bgtiban
 *
 */
@Data
@Entity // Indicamos al motor de Persitencia de BD que esta es una clase de persistencia
@Table(name="PRODUCTOS"/*, schema="gestionClientes"*/) // Indicamos que es una tabla
public class Producto implements Serializable {
	
	/**  */
	private static final long serialVersionUID = -1924284492654000760L;
	
	@Id //mapeamos el id
	@GeneratedValue(strategy= GenerationType.IDENTITY) //indcamos que el id es autoincremental
	private long id;

	@NotEmpty
	private String nombre;

}
