package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.utils.dao.BasicModel;

@SuppressWarnings("serial")
@Entity
public class Estados extends Model implements BasicModel<Long> {
	
	@Id	@GeneratedValue(strategy = GenerationType.AUTO) @Column(name="est_id")
	private long id;
	@Column(name="est_nombre")
	private String Nombre;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public Long getKey() {
		return this.id;
	}
	@Override
	public void setKey(Long i) {
		this.id = i;
	}
	
}
