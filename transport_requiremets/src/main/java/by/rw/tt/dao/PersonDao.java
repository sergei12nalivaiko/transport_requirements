package by.rw.tt.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import by.rw.tt.entity.Person;
@Stateless
public class PersonDao extends AbstractDao{
	
	public List<Person> selectPersonAllInfoByID(String idPerson) {
		TypedQuery<Person> query = em.createQuery("select person from Person person where person.idPerson = :idPerson", Person.class);
		query.setParameter("idPerson", idPerson);
		List<Person> allrl = query.getResultList();
		List<Person> all = new ArrayList<Person>(allrl);
		return all;
	}

}
