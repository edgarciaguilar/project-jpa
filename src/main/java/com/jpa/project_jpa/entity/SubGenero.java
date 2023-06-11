/**
 * 
 */
package com.jpa.project_jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 * @author edgar
 * Clase que representa la clase subgenero
 */

@Entity
@Table(name = "subgenero")
public class SubGenero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSubGenero;
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGenero")
	//@Cascade(CascadeType.PERSIST)
	@Cascade(CascadeType.REMOVE)
	private Genero genero;
	
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaModificacion;
	private boolean estatus;
	
	public Long getIdSubGenero() {
		return idSubGenero;
	}
	public void setIdSubGenero(Long idSubGenero) {
		this.idSubGenero = idSubGenero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public LocalDateTime getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(LocalDateTime fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	

}
