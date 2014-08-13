package models;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import play.data.validation.Constraints.MaxLength;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.utils.dao.BasicModel;

@Entity
@Table(name="tbl_numeracioninformes")

public class Numeracion_Informes extends Model implements BasicModel<Long>{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long num_id;
	
	@Basic	@Required	@Column(name="num_codigoinforme")@Size(min = 21, max = 21)
	private String Codigo; //ESTE PUEDE SER IN-YACHAY-GI-DSI-0001
	@Required @Column(name="num_fecha")
	private Date Fecha;			//LA FECHA DEL INGRESO DE LA LINEA
	@Column(name="num_titulo")
	private String Titulo; 		//TITULO DEL INFORME
	@Basic	@Required	@Column(name="num_requiriente")
	private String Requiriente;	//PERSONA QUE REQUIERE EL INFORME
	@Basic @Required @MaxLength(256) @Column(name="num_referente",length = 256)
	private String Referente;	// A QUE SE REFIERE EL INFORME
	@Basic 	@Required @Column(name="num_realizado")
	private String Realizado; //QUIEN REALIZA EL INFORME
	@Basic @Column(name="num_revisado")
	private String Revisado; //QUIEN REVISA EL INFORME
	@Column(name="num_aprobado")
	private String Aprobado; // QUIEN APRUEBA EL INFORME
	@Basic	@Required	@MaxLength(256)	@Column(name="num_observaciones",length = 256)
	private String Observaciones; //SI EXISTE ALGUNA OBSERVACION
	@Basic 	@Required @Column(name="num_correonotificar")
	private String Correo;//CORREO A NOTIFICAR LE INFORME

	@Override
	public Long getKey() {return this.num_id;}
	@Override
	public void setKey(Long id) {this.num_id = id;}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getRequiriente() {
		return Requiriente;
	}
	public void setRequiriente(String requiriente) {
		Requiriente = requiriente;
	}
	public String getReferente() {
		return Referente;
	}
	public void setReferente(String referente) {
		Referente = referente;
	}
	public String getRealizado() {
		return Realizado;
	}
	public void setRealizado(String realizado) {
		Realizado = realizado;
	}
	public String getRevisado() {
		return Revisado;
	}
	public void setRevisado(String revisado) {
		Revisado = revisado;
	}
	public String getAprobado() {
		return Aprobado;
	}
	public void setAprobado(String aprobado) {
		Aprobado = aprobado;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	
	
	

}
