package models;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;

//TAB

@Entity
@Table(name = "tbl_actividades")
@SuppressWarnings("serial")
public class Actividades extends Model implements BasicModel<Long> {
	
	@Id	@GeneratedValue(strategy = GenerationType.AUTO) @Column(name="act_id")
	private Long Id;

	@Basic @Required  @Column(name="act_nombre")
	private String Nombre;
	
	@Basic 	@Required @Column(name="act_responsable")
	private String Responsable;
	
	@Basic 	@Required	@MaxLength(256)	@Column(name="act_descripcion",length = 256)
	private String Descripcion;

	@Basic 	@Required @Column(name="act_secuencia")
	private Integer Secuencia;

	@Basic @MaxLength(256) @Column(name="act_comentarios",length = 256)
	private String Comentarios;

	@Basic @MaxLength(150) @Column(name="act_impedimentos")
	private String Impedimentos;

	@Basic @Column(name="act_complejidad")
	private String Complejidad; //  vista como ALTA, MEDIA BAJA
	
	@Basic @Required @Column(name="act_estimacionoriginal")
	private Integer Estimacion_Original;

	@Basic @Required @Column(name="act_trabajocompletado")
	private Integer Trabajo_completado;
	
	@Basic @Required @Column(name="act_trabajorestante")
	private Integer Trabajo_Restante;
	
	@Basic @Column(name="act_enlacedocumento")
	private String Enlace_documento;
	
	@Required @Column(name="act_fechainicio")
	private Date Fecha_Inicio;  //NORMA ISO 21500:2013
	
	@Required @Column(name="act_fechafin") @Future //La fecha debes ser mayor que hoy
	private Date Fecha_Fin;  //NORMA ISO 21500:2013
	
	//DECLARACION PARA LA RELACION DE LAS TABLAS
	@ManyToOne
	public Proyectos Activi; 
	
	
	public Long getId() {
		return this.Id;
	}

	public void setId(Long id) {
		this.Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getResponsable() {
		return Responsable;
	}

	public void setResponsable(String responsable) {
		Responsable = responsable;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getSecuencia() {
		return Secuencia;
	}

	public void setSecuencia(Integer secuencia) {
		Secuencia = secuencia;
	}

	public String getComentarios() {
		return Comentarios;
	}

	public void setComentarios(String comentarios) {
		Comentarios = comentarios;
	}

	public String getImpedimentos() {
		return Impedimentos;
	}

	public void setImpedimentos(String impedimentos) {
		Impedimentos = impedimentos;
	}

	public String getComplejidad() {
		return Complejidad;
	}

	public void setComplejidad(String complejidad) {
		Complejidad = complejidad;
	}

	public Integer getEstimacion_Original() {
		return Estimacion_Original;
	}

	public void setEstimacion_Original(Integer estimacion_Original) {
		Estimacion_Original = estimacion_Original;
	}

	public Integer getTrabajo_completado() {
		return Trabajo_completado;
	}

	public void setTrabajo_completado(Integer trabajo_completado) {
		Trabajo_completado = trabajo_completado;
	}

	public Integer getTrabajo_Restante() {
		return Trabajo_Restante;
	}

	public void setTrabajo_Restante(Integer trabajo_Restante) {
		Trabajo_Restante = trabajo_Restante;
	}

	public String getEnlace_documento() {
		return Enlace_documento;
	}

	public void setEnlace_documento(String enlace_documento) {
		Enlace_documento = enlace_documento;
	}

	public Date getFecha_Inicio() {
		return Fecha_Inicio;
	}

	public void setFecha_Inicio(Date fecha_Inicio) {
		Fecha_Inicio = fecha_Inicio;
	}

	public Date getFecha_Fin() {
		return Fecha_Fin;
	}

	public void setFecha_Fin(Date fecha_Fin) {
		Fecha_Fin = fecha_Fin;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Complex [key=").append(Id).append(", stringField=").append(Nombre)
				.append(", stringField=").append(Responsable).append(", stringField=").append(Descripcion)
				.append(", integerField=").append(Secuencia).append(", stringField=").append(Comentarios)
				.append(", stringField=").append(Impedimentos).append(", stringField=").append(Complejidad)
				.append(", integerField=").append(Estimacion_Original).append(", integerField=").append(Trabajo_completado)
				.append(", integerField=").append(Trabajo_Restante).append(", stringField=").append(Enlace_documento)
				.append(", dateField=").append(Fecha_Inicio).append(", dateField=").append(Fecha_Fin)
				.append("]");
		
		return builder.toString();
	}

	

	@Override
	public Long getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setKey(Long arg0) {
		// TODO Auto-generated method stub
		
	}
}
