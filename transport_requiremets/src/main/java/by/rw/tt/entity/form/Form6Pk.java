package by.rw.tt.entity.form;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Form6Pk implements Serializable{
	
	private static final long serialVersionUID = -3781485609654522703L;

	@Column(name = "TICKET_NUMBER")
	private String ticket_number;

	@Column(name = "DATE_ACTUAL_ISSUE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_actual_issue;

	public Form6Pk() {
		super();
	}

	public Form6Pk(String ticket_number, Date date_actual_issue) {
		super();
		this.ticket_number = ticket_number;
		this.date_actual_issue = date_actual_issue;
	}

	public String getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(String ticket_number) {
		this.ticket_number = ticket_number;
	}

	public Date getDate_actual_issue() {
		return date_actual_issue;
	}

	public void setDate_actual_issue(Date date_actual_issue) {
		this.date_actual_issue = date_actual_issue;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date_actual_issue, ticket_number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form6Pk other = (Form6Pk) obj;
		return Objects.equals(date_actual_issue, other.date_actual_issue)
				&& Objects.equals(ticket_number, other.ticket_number);
	}

	@Override
	public String toString() {
		return "Form6Pk [ticket_number=" + ticket_number + ", date_actual_issue=" + date_actual_issue + "]";
	}

}
