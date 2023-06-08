package com.jpa.project_jpa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "disquera")
public class Disquera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDisquera;
	
	private String descripcion;
	private LocalDateTime fechaCreacion;
	private LocalDate fechaModificacion;
	@Column(name = "estatus")
	private boolean status;
	
	public Long getIdDisquera() {
		return idDisquera;
	}
	public void setIdDisquera(Long idDisquera) {
		this.idDisquera = idDisquera;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime localDateTime) {
		this.fechaCreacion = localDateTime;
	}
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	

}
