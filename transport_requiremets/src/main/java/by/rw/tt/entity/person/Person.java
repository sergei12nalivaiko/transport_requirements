package by.rw.tt.entity.person;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import by.rw.tt.entity.sp.OrganizationSP;

@Entity
@Table(name = "PERSONAL", schema = "TICKET")
public class Person implements Serializable {

	private static final long serialVersionUID = -1733927108307251902L;

	@EmbeddedId
	private PersonPk pk;

	@Column(name = "DATE_RECORD")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateRecord;

	@Column(name = "F_PERSON")
	private String surname;

	@Column(name = "I_PERSON")
	private String firstName;

	@Column(name = "O_PERSON")
	private String middleName;

	@Transient
	private String fullName;

	@Column(name = "CARD_NUM")
	private String certificate;

	@Column(name = "POST_KOR")
	private String shortPost;

	@Column(name = "POST_POL")
	private String fullPost;

	@Column(name = "DATE_WORK")
	@Temporal(TemporalType.DATE)
	private Date dateStartWork;

	@Column(name = "DATE_DISMISSAL")
	@Temporal(TemporalType.DATE)
	private Date dateDismissal;

	@Column(name = "ADDRESS_PERSON")
	private String address;

	@Column(name = "NOTE")
	private String note;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "ORG_NUM", referencedColumnName = "ORG_NUM"),
			@JoinColumn(name = "OFFICE_NUM", referencedColumnName = "OFFICE_NUM") })
	private OrganizationSP organization;

	@ManyToOne
	@JoinColumn(name = "CODE_STATUS", referencedColumnName = "CODE_STATUS")
	private PersonStatus status;

	@Column(name = "ZNAK")
	private String znak;

	@Column(name = "CODE_ZNAK")
	private String numZnak;

	@Column(name = "LOGIN")
	private String login;

	public PersonPk getPk() {
		return pk;
	}

	public void setPk(PersonPk pk) {
		this.pk = pk;
	}

	public Date getDateRecord() {
		return dateRecord;
	}

	public void setDateRecord(Date dateRecord) {
		this.dateRecord = dateRecord;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getShortPost() {
		return shortPost;
	}

	public void setShortPost(String shortPost) {
		this.shortPost = shortPost;
	}

	public String getFullPost() {
		return fullPost;
	}

	public void setFullPost(String fullPost) {
		this.fullPost = fullPost;
	}

	public Date getDateStartWork() {
		return dateStartWork;
	}

	public void setDateStartWork(Date dateStartWork) {
		this.dateStartWork = dateStartWork;
	}

	public Date getDateDismissal() {
		return dateDismissal;
	}

	public void setDateDismissal(Date dateDismissal) {
		this.dateDismissal = dateDismissal;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public OrganizationSP getOrganization() {
		return organization;
	}

	public void setOrganization(OrganizationSP organization) {
		this.organization = organization;
	}

	public PersonStatus getStatus() {
		return status;
	}

	public void setStatus(PersonStatus status) {
		this.status = status;
	}

	public String getZnak() {
		return znak;
	}

	public void setZnak(String znak) {
		this.znak = znak;
	}

	public String getNumZnak() {
		return numZnak;
	}

	public void setNumZnak(String numZnak) {
		this.numZnak = numZnak;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, certificate, dateDismissal, dateRecord, dateStartWork, firstName, fullName,
				fullPost, login, middleName, note, numZnak, organization, pk, shortPost, status, surname, znak);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && Objects.equals(certificate, other.certificate)
				&& Objects.equals(dateDismissal, other.dateDismissal) && Objects.equals(dateRecord, other.dateRecord)
				&& Objects.equals(dateStartWork, other.dateStartWork) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(fullName, other.fullName) && Objects.equals(fullPost, other.fullPost)
				&& Objects.equals(login, other.login) && Objects.equals(middleName, other.middleName)
				&& Objects.equals(note, other.note) && Objects.equals(numZnak, other.numZnak)
				&& Objects.equals(organization, other.organization) && Objects.equals(pk, other.pk)
				&& Objects.equals(shortPost, other.shortPost) && Objects.equals(status, other.status)
				&& Objects.equals(surname, other.surname) && Objects.equals(znak, other.znak);
	}

	@Override
	public String toString() {
		return "Person [pk=" + pk + ", dateRecord=" + dateRecord + ", surname=" + surname + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", fullName=" + fullName + ", certificate=" + certificate
				+ ", shortPost=" + shortPost + ", fullPost=" + fullPost + ", dateStartWork=" + dateStartWork
				+ ", dateDismissal=" + dateDismissal + ", address=" + address + ", note=" + note + ", organization="
				+ organization + ", status=" + status + ", znak=" + znak + ", numZnak=" + numZnak + ", login=" + login
				+ "]";
	}

}
