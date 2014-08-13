/**

* DEVELOP BY:	ING FABIAN JIMENEZ
				ING GIOVANNI

*/

package models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;

@Entity
@Table(name = "tbl_proyectos")
public class Proyectos extends Model implements BasicModel<Long> {

	private static final long serialVersionUID = 1L;

	@Id	@GeneratedValue(strategy = GenerationType.AUTO)	@Column(name="pro_id")
	private Long Id;

	@Basic 	@Required @Column(name="pro_nombre")
	private String Nombre;
	@MaxLength(256)	@Column(name="pro_descripcion",length = 256)
	private String Descripcion;
	@Column(name="pro_costo")
	private Double Costo;
	@Column(name="pro_responsable")
	private String Responsable;
	@Column(name="pro_prioridad")
	private String Prioridad;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Double getCosto() {
		return Costo;
	}

	public void setCosto(Double costo) {
		Costo = costo;
	}

	public String getResponsable() {
		return Responsable;
	}

	public void setResponsable(String responsable) {
		Responsable = responsable;
	}

	public String getPrioridad() {
		return Prioridad;
	}

	public void setPrioridad(String prioridad) {
		Prioridad = prioridad;
	}

	@Override
	public Long getKey() {return this.Id;}

	@Override
	public void setKey(Long b) {this.Id = b;}
}
