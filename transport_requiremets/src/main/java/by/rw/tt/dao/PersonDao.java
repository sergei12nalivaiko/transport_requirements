package by.rw.tt.dao;

import java.util.List;

import by.rw.tt.entity.person.Person;

public interface PersonDao {
	
	List<Person> selectPersonAllInfoByID(String idPerson);
	Person selectPersonByID(String id);
}
