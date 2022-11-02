package by.rw.tt.entity.form;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Form4Pk implements Serializable {

	private static final long serialVersionUID = -411040878451047642L;

	@Column(name = "TICKET_NUMBER")
	private String ticketNumber;

	@Column(name = "DATE_ISSUE_F4")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateIssueF4;

	public Form4Pk() {
		super();
	}

	public Form4Pk(String ticketNumber, Date dateIssueF4) {
		super();
		this.ticketNumber = ticketNumber;
		this.dateIssueF4 = dateIssueF4;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public Date getDateIssueF4() {
		return dateIssueF4;
	}

	public void setDateIssueF4(Date dateIssueF4) {
		this.dateIssueF4 = dateIssueF4;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateIssueF4, ticketNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form4Pk other = (Form4Pk) obj;
		return Objects.equals(dateIssueF4, other.dateIssueF4) && Objects.equals(ticketNumber, other.ticketNumber);
	}

	@Override
	public String toString() {
		return "Form4Pk [ticketNumber=" + ticketNumber + ", dateIssueF4=" + dateIssueF4 + "]";
	}

}
