package com.jpa.project_jpa.dao;

import java.util.List;

import com.jpa.project_jpa.entity.Disquera;

public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	

}
