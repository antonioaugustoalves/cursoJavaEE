package br.com.cursoprime.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class BaseDao {
	private EntityManagerFactory emf;
	
	
	public EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public BaseDao() {
		emf = Persistence.createEntityManagerFactory("curso");
	}
	
	public Session getSession() {
		return (Session)getEntityManager().getDelegate();
		
	}
	
	public static void main (String [] args) {
		BaseDao dao = new BaseDao();
		dao.getSession();
	}

}
