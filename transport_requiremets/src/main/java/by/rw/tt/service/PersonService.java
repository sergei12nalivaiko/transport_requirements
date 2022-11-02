package by.rw.tt.service;

import java.util.List;

import by.rw.tt.entity.person.Person;

public interface PersonService {
	
	List<Person> selectPersonAllInfoByID(String idPerson);
	Person selectPersonByID(String id);
}
