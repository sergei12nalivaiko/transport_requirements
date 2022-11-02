package by.rw.tt.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import by.rw.tt.dao.AbstractDao;
import by.rw.tt.dao.PersonDao;
import by.rw.tt.entity.person.Person;

@Stateless
public class PersonDaoImpl extends AbstractDao implements PersonDao {

	private static final String PERSON_SQL_PATH = "personSQL.properties";
	private static final Properties PERSON_SQL_PROPERTIES = new Properties();;

	@PostConstruct
	public void init() {
		try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(PERSON_SQL_PATH)) {
			PERSON_SQL_PROPERTIES.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Person> selectPersonAllInfoByID(String idPerson) {
		TypedQuery<Person> query = emIb23.createQuery(PERSON_SQL_PROPERTIES.getProperty("find_all_info_by_user_id"), Person.class);
		query.setParameter("idPerson", idPerson);
		List<Person> allrl = query.getResultList();
		List<Person> all = new ArrayList<Person>(allrl);
		return all;
	}

	@Override
	public Person selectPersonByID(String id) {
		Query q = emIb23.createNativeQuery(PERSON_SQL_PROPERTIES.getProperty("find_person_by_id").replace("id", id), Person.class);
		Person person = (Person) q.getSingleResult();
		return person;
	}
}
