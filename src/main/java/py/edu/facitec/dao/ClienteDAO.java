package py.edu.facitec.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import py.edu.facitec.model.Cliente;

//Indicamos a Spring que trabaja con bd
@Repository
public class ClienteDAO {
	
	
	//Unidad de Persistencia
	@PersistenceContext
	private EntityManager em;
	
public void insertar(Cliente cliente) {
	//método para registrar.
	em.persist(cliente);
	
}
	

}
