/**
 * 
 */
package com.jpa.project_jpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.jpa.project_jpa.dao.SubGeneroDAO;
import com.jpa.project_jpa.dao.impl.SubGeneroDAOImpl;
import com.jpa.project_jpa.entity.Genero;
import com.jpa.project_jpa.entity.SubGenero;

/**
 * @author edgar
 * Clase test para comprobar el fucionamiento de los metodos del CRUD del subgenero
 *
 */
class SubGeneroDAOImplTest {
	
	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();
	

	/**
	 * Test method for {@link com.jpa.project_jpa.dao.impl.SubGeneroDAOImpl#guardar(com.jpa.project_jpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Banda filarmonica");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Banda");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		
		this.subGeneroDAO.guardar(subGenero);
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.jpa.project_jpa.dao.impl.SubGeneroDAOImpl#actualizar(com.jpa.project_jpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGeneroConsultado = this.subGeneroDAO.consultarById(10L);
		subGeneroConsultado.setDescripcion("Banda de metales");
		subGeneroConsultado.getGenero().setDescripcion("metales de banda");
		
		this.subGeneroDAO.actualizar(subGeneroConsultado);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.jpa.project_jpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(10L);
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.jpa.project_jpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGenerosConsultados = this.subGeneroDAO.consultar();
		assertTrue(subGenerosConsultados.size()>0);
		for(SubGenero subGenero: subGenerosConsultados) {
			System.out.println("Subgenero: " +subGenero.getDescripcion());
			System.out.println("Genero: " +subGenero.getGenero().getDescripcion());
		}
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.jpa.project_jpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
