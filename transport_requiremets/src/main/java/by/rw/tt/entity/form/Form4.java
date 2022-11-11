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

import by.rw.tt.entity.person.Person;
import by.rw.tt.entity.sp.FormSP;
import by.rw.tt.entity.sp.TicketOfficeSP;

@Entity
@Table(name="FORM4", schema="TICKET")
public class Form4 implements Serializable{
	
	private static final long serialVersionUID = -7372541223384919118L;

	@EmbeddedId
	private Form4Pk form4Pk;
	
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID_PERSON"),
			@JoinColumn(name = "ID_RECORD", referencedColumnName = "ID_RECORD") })
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "OFFICE_NUM")
	private TicketOfficeSP ticketOffice;
	
	@Column(name="DATE_COR")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_cor;
	
	@ManyToOne
	@JoinColumn(name = "CODE", referencedColumnName = "CODE")
	private FormSP formSP;

	public Form4() {
		super();
	}

	public Form4(Form4Pk form4Pk, Person person, TicketOfficeSP ticketOffice, Date date_cor, FormSP formSP) {
		super();
		this.form4Pk = form4Pk;
		this.person = person;
		this.ticketOffice = ticketOffice;
		this.date_cor = date_cor;
		this.formSP = formSP;
	}

	public Form4Pk getForm4Pk() {
		return form4Pk;
	}

	public void setForm4Pk(Form4Pk form4Pk) {
		this.form4Pk = form4Pk;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public TicketOfficeSP getTicketOffice() {
		return ticketOffice;
	}

	public void setTicketOffice(TicketOfficeSP ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public Date getDate_cor() {
		return date_cor;
	}

	public void setDate_cor(Date date_cor) {
		this.date_cor = date_cor;
	}

	public FormSP getFormSP() {
		return formSP;
	}

	public void setFormSP(FormSP formSP) {
		this.formSP = formSP;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date_cor, form4Pk, formSP, person, ticketOffice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form4 other = (Form4) obj;
		return Objects.equals(date_cor, other.date_cor) && Objects.equals(form4Pk, other.form4Pk)
				&& Objects.equals(formSP, other.formSP) && Objects.equals(person, other.person)
				&& Objects.equals(ticketOffice, other.ticketOffice);
	}

	@Override
	public String toString() {
		return "Form4 [form4Pk=" + form4Pk + ", person=" + person + ", ticketOffice=" + ticketOffice + ", date_cor="
				+ date_cor + ", formSP=" + formSP + "]";
	}
	
	
}
