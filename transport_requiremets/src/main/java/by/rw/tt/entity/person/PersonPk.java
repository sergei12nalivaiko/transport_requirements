package by.rw.tt.entity.person;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

import javax.persistence.Embeddable;

@Embeddable
public class PersonPk implements Serializable {

	private static final long serialVersionUID = -5342848012792806365L;

	@Column(name = "ID_PERSON")
	private String idPerson;

	@Column(name = "ID_RECORD")
	private int idRecord;

	public PersonPk() {
		super();
	}

	public PersonPk(String idPerson, int idRecord) {
		super();
		this.idPerson = idPerson;
		this.idRecord = idRecord;
	}

	public String getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}

	public int getIdRecord() {
		return idRecord;
	}

	public void setIdRecord(int idRecord) {
		this.idRecord = idRecord;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPerson, idRecord);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonPk other = (PersonPk) obj;
		return Objects.equals(idPerson, other.idPerson) && idRecord == other.idRecord;
	}

	@Override
	public String toString() {
		return "PersonPk [idPerson=" + idPerson + ", idRecord=" + idRecord + "]";
	}
}
