package com.jpa.project_jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.jpa.project_jpa.dao.DisqueraDAO;
import com.jpa.project_jpa.entity.Disquera;

public class DisqueraDAOImpl implements DisqueraDAO {
	
	private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("my-persistence-unit"); 

	@Override
	public void guardar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
			em.persist(disquera);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(et!=null) {
				et.rollback();
			}
			
		}finally {
			em.close();
		}
		
	}

	@Override
	public void actualizar(Disquera disquera) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
			em.merge(disquera);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(et!=null) {
				et.rollback();
			}
			
		}finally {
			em.close();
		}
	}

	@Override
	public void eliminar(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		Disquera disqueraConsultada = em.find(Disquera.class, id);
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		try {
			em.remove(disqueraConsultada);
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(et!=null) {
				et.rollback();
			}
			
		}finally {
			em.close();
		}
	}

	@Override
	public List<Disquera> consultar() {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		TypedQuery<Disquera> qDisquera= (TypedQuery<Disquera>) em.createQuery("FROM Disquera ORDER BY descripcion");
		return qDisquera.getResultList();
	}

	@Override
	public Disquera consultarById(Long id) {
		EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
		Disquera disqueraConsultar = em.find(Disquera.class, id);
		if (disqueraConsultar == null) {
			throw new EntityNotFoundException("La disquera con ID "+ id + " no se encontró");
		}
		return disqueraConsultar;
	}

}
