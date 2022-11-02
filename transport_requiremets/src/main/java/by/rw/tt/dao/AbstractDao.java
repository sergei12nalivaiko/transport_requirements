package by.rw.tt.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AbstractDao {
	
	@PersistenceContext(unitName = "transport_requiremets")
	protected EntityManager emIb23;

	@PersistenceContext(unitName = "TransportRequirementsDB2ABD13")
	protected EntityManager emDb2abd13;
}
