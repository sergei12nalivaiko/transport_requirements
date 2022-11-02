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

import by.rw.tt.entity.TicketOffice;
import by.rw.tt.entity.person.Person;
import by.rw.tt.entity.sp.FormSP;

@Entity
@Table(name = "FORM6", schema = "TICKET")
public class Form6 implements Serializable{

	private static final long serialVersionUID = -3440036569336697137L;

	@EmbeddedId
	private Form6Pk form6Pk;

	@Column(name = "DATE_ISSUE_F6")
	@Temporal(TemporalType.DATE)
	private Date dateIssueF6;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "ID_PERSON", referencedColumnName = "ID_PERSON"),
			@JoinColumn(name = "ID_RECORD", referencedColumnName = "ID_RECORD") })
	private Person person;

	@ManyToOne
	@JoinColumn(name = "CODE", referencedColumnName = "CODE")
	private FormSP formSP;

	@Column(name = "SERIES")
	private String series;

	@Column(name = "CODE_KIND")
	private int codeKind;

	@ManyToOne
	@JoinColumn(name = "OFFICE_NUM")
	private TicketOffice ticketOffice;

	@Column(name = "DATE_COR")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_cor;

	@Transient
	private String trtreb;

	public Form6() {
		super();
	}

	public Form6(Form6Pk form6Pk, Date dateIssueF6, Person person, FormSP formSP, String series, int codeKind,
			TicketOffice ticketOffice, Date date_cor, String trtreb) {
		super();
		this.form6Pk = form6Pk;
		this.dateIssueF6 = dateIssueF6;
		this.person = person;
		this.formSP = formSP;
		this.series = series;
		this.codeKind = codeKind;
		this.ticketOffice = ticketOffice;
		this.date_cor = date_cor;
		this.trtreb = trtreb;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codeKind, dateIssueF6, date_cor, form6Pk, formSP, person, series, ticketOffice, trtreb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form6 other = (Form6) obj;
		return codeKind == other.codeKind && Objects.equals(dateIssueF6, other.dateIssueF6)
				&& Objects.equals(date_cor, other.date_cor) && Objects.equals(form6Pk, other.form6Pk)
				&& Objects.equals(formSP, other.formSP) && Objects.equals(person, other.person)
				&& Objects.equals(series, other.series) && Objects.equals(ticketOffice, other.ticketOffice)
				&& Objects.equals(trtreb, other.trtreb);
	}

	@Override
	public String toString() {
		return "Form6 [form6Pk=" + form6Pk + ", dateIssueF6=" + dateIssueF6 + ", person=" + person + ", formSP="
				+ formSP + ", series=" + series + ", codeKind=" + codeKind + ", ticketOffice=" + ticketOffice
				+ ", date_cor=" + date_cor + ", trtreb=" + trtreb + "]";
	}

}
