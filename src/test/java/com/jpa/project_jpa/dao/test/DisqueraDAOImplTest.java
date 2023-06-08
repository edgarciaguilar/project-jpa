package com.jpa.project_jpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.jpa.project_jpa.dao.DisqueraDAO;
import com.jpa.project_jpa.dao.impl.DisqueraDAOImpl;
import com.jpa.project_jpa.entity.Disquera;

class DisqueraDAOImplTest {

	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();
	
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("Sony Music");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setStatus(true);
		this.disqueraDAO.guardar(disquera);
		//fail("Not yet implemented");
	}

	@Test
	void testActualizar() {
		fail("Not yet implemented");
	}

	@Test
	void testEliminar() {
		
		Long id = 11L;
		this.disqueraDAO.eliminar(id);
		//fail("Not yet implemented");
	}

	@Test
	void testConsultar() {
		/*Disquera disqueraConsultar =  this.disqueraDAO.consultarById(10l);
		disqueraConsultar.setDescripcion("Musart");
		this.disqueraDAO.actualizar(disqueraConsultar);
		*/
		List<Disquera> consultadas =  this.disqueraDAO.consultar();
		assertTrue(consultadas.size()>0);
		consultadas.forEach(disquera -> System.out.println(disquera.getDescripcion()));
		
		//fail("Not yet implemented");
	}

	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(90L);
		System.out.println("Disquera: " + disquera.getDescripcion());
		
		//fail("Not yet implemented");
	}

}
