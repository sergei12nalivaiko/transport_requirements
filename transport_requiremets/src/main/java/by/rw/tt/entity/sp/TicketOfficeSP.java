package by.rw.tt.entity.sp;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "SP_TICKET_OFFICE", schema = "TICKET")
public class TicketOfficeSP implements Serializable {
	private static final long serialVersionUID = 5681368981032812138L;

	@Id
	@Column(name = "OFFICE_NUM")
	private Integer number;

	@Column(name = "NOD_NUM")
	private String nodNumber;

	@Column(name = "OFFICE_NAME")
	private String name;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "FIO")
	private String fio;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "OBJECT_NAME")
	private String objectName;

	@Transient
	private String numberAndName;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getNodNumber() {
		return nodNumber;
	}

	public void setNodNumber(String nodNumber) {
		this.nodNumber = nodNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getNumberAndName() {
		return numberAndName;
	}

	public void setNumberAndName(String numberAndName) {
		this.numberAndName = numberAndName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, fio, name, nodNumber, number, numberAndName, objectName, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TicketOfficeSP other = (TicketOfficeSP) obj;
		return Objects.equals(email, other.email) && Objects.equals(fio, other.fio) && Objects.equals(name, other.name)
				&& Objects.equals(nodNumber, other.nodNumber) && Objects.equals(number, other.number)
				&& Objects.equals(numberAndName, other.numberAndName) && Objects.equals(objectName, other.objectName)
				&& Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "TicketOffice [number=" + number + ", nodNumber=" + nodNumber + ", name=" + name + ", phone=" + phone
				+ ", fio=" + fio + ", email=" + email + ", objectName=" + objectName + ", numberAndName="
				+ numberAndName + "]";
	}

}
