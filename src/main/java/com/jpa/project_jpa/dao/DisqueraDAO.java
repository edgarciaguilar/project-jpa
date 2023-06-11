package com.jpa.project_jpa.dao;

import java.util.List;

import com.jpa.project_jpa.entity.Disquera;

public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	
	/**
	 * Metodo que permite consultar con JPQL la disqera a partir de una descripcion
	 * @param descripcion {@link String} descripcion de la disquera
	 * @return {@link Disquera} de la disquera consultada
	 * */
	
	Disquera consultarByDescripcionJPQL(String descripcion);
	
	/**
	 * Metodo que permite consultar con SQL nativo la disqera a partir de una descripcion
	 * @param descripcion {@link String} descripcion de la disquera
	 * @return {@link Disquera} de la disquera consultada
	 * */
	
	Disquera consultarByDescripcionNative(String descripcion);
	

}
