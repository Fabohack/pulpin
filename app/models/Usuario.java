package models;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;


@Entity
@Table(name="tbl_persona")
public class Usuario extends Model implements BasicModel<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name="per_id")
	private long Id;
	@Basic	@Required  @Column(name="per_nombre")
	private String Nombre;
	@Basic 	@Required @Column(name="per_apellido")
	private String Apellido;
	@Basic 	@Required @Column(name="per_password")@Size(min = 6, max = 50)
	private String Password;
	@Basic 	@Required @Column(name="per_correo") @Email
	private String Correo;
	@Column(name="per_celular")
	private String Celular;
	@Basic	@Required @Column(name="per_notificacion")
	private String Notificacion;
	
	public Usuario() {}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getCelular() {
		return Celular;
	}

	public void setCelular(String celular) {
		Celular = celular;
	}

	public String getNotificacion() {
		return Notificacion;
	}

	public void setNotificacion(String notificacion) {
		Notificacion = notificacion;
	}

	@Override
	public Long getKey() {return this.Id;}

	@Override
	public void setKey(Long c) {this.Id = c;}


}