package com.jpa.project_jpa.dao;

import java.util.List;

import com.jpa.project_jpa.entity.SubGenero;

/**
 * @author edgar
 * Interface DAO que realiza el CRUD con JPA para la tabla subgenero
 * */

public interface SubGeneroDAO {
	
	void guardar(SubGenero subGenero);
	
	void actualizar(SubGenero subGenero);
	
	void eliminar(Long id);
	
	List<SubGenero> consultar();
	
	SubGenero consultarById(Long id);

}
