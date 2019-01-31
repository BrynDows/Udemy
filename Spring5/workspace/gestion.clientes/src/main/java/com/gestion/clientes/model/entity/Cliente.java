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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;


/**Clase que corresponde con la tabla CLIENTES
 * @author bgtiban
 *
 */
@Data
@Entity // Indicamos al motor de Persitencia de BD que esta es una clase de persistencia
@Table(name="CLIENTES"/*, schema="gestionClientes"*/) // Indicamos que es una tabla
public class Cliente implements Serializable {
	
	/**  */
	private static final long serialVersionUID = -1924284492654000760L;
	
	@Id //mapeamos el id
	@GeneratedValue(strategy= GenerationType.IDENTITY) //indcamos que el id es autoincremental
	private Long id;

	private String nombre;

	private int edad;

	@Column(name="fecha_nacimiento") //indicamos el nombre del campo de la tabla
	@Temporal(TemporalType.DATE) // se convertirá automáticamente a timeStamp
	private Date fecAlta;

	

	
}
