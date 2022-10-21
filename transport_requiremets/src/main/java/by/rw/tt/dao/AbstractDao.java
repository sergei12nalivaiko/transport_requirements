package by.rw.tt.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AbstractDao {
	@PersistenceContext
	protected EntityManager em;
}
