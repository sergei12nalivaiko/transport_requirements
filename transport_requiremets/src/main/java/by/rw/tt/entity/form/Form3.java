package by.rw.tt.entity.form;

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

import by.rw.tt.entity.person.Person;
import by.rw.tt.entity.sp.TicketOfficeSP;

@Entity
@Table(name = "FORM3", schema = "TICKET")
public class Form3 implements Serializable {

	private static final long serialVersionUID = 1820218889881244473L;

	@EmbeddedId
	private Form3Pk form3Pk;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID_PERSON"),
			@JoinColumn(name = "ID_RECORD", referencedColumnName = "ID_RECORD") })
	private Person person;

	@Column(name = "SERIES")
	private String series;

	@Column(name = "CODE_KIND")
	private int codeKind;

	@Column(name = "DATE_COR")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCor;

	@Transient
	private String trtreb;

	@ManyToOne
	@JoinColumn(name = "OFFICE_NUM")
	private TicketOfficeSP ticketOffice;

	public Form3Pk getForm3Pk() {
		return form3Pk;
	}

	public void setForm3Pk(Form3Pk form3Pk) {
		this.form3Pk = form3Pk;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getCodeKind() {
		return codeKind;
	}

	public void setCode_kind(int codeKind) {
		this.codeKind = codeKind;
	}

	public Date getDateCor() {
		return dateCor;
	}

	public void setDateCor(Date dateCor) {
		this.dateCor = dateCor;
	}

	public String getTrtreb() {
		return trtreb;
	}

	public void setTrtreb(String trtreb) {
		this.trtreb = trtreb;
	}

	public TicketOfficeSP getTicketOffice() {
		return ticketOffice;
	}

	public void setTicketOffice(TicketOfficeSP ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codeKind, dateCor, form3Pk, person, series, ticketOffice, trtreb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form3 other = (Form3) obj;
		return codeKind == other.codeKind && Objects.equals(dateCor, other.dateCor)
				&& Objects.equals(form3Pk, other.form3Pk) && Objects.equals(person, other.person)
				&& Objects.equals(series, other.series) && Objects.equals(ticketOffice, other.ticketOffice)
				&& Objects.equals(trtreb, other.trtreb);
	}

	@Override
	public String toString() {
		return "Form [form3Pk=" + form3Pk + ", person=" + person + ", series=" + series + ", code_kind=" + codeKind
				+ ", date_cor=" + dateCor + ", trtreb=" + trtreb + ", ticketOffice=" + ticketOffice + "]";
	}

}
