package com.relaciones.principales;

import java.util.List;

import com.relaciones.dominio.Categoria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Ejemplo05 {

	public static void main(String[] args) {

		//Sale de esa linea el nombre : <persistence-unit name="biblioteca2" transaction-type="RESOURCE_LOCAL">
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca2"); 
		EntityManager em = emf.createEntityManager();
		
		//Mostrar por pantalla las categorias que tengan menos de 3 libros de la misma categoria 
		TypedQuery<Categoria> consulta = em.createQuery("SELECT c FROM Categoria c WHERE SIZE(c.libros) < 3", Categoria.class);
		
		List<Categoria> categorias = consulta.getResultList();
		
		for(Categoria cat: categorias) {
			System.out.println(cat);
		}

	}
	
}
