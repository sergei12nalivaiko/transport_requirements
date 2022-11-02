package by.rw.tt.entity.form;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class Form3Pk implements Serializable {

	private static final long serialVersionUID = -3862744128149739360L;

	@Column(name = "TICKET_NUMBER")
	private String ticket_number;

	@Column(name = "DATE_ISSUE_F3")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_issue_f3;

	public Form3Pk() {
		super();
	}

	public Form3Pk(String ticket_number, Date date_issue_f3) {
		super();
		this.ticket_number = ticket_number;
		this.date_issue_f3 = date_issue_f3;
	}

	public String getTicket_number() {
		return ticket_number;
	}

	public void setTicket_number(String ticket_number) {
		this.ticket_number = ticket_number;
	}

	public Date getDate_issue_f3() {
		return date_issue_f3;
	}

	public void setDate_issue_f3(Date date_issue_f3) {
		this.date_issue_f3 = date_issue_f3;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date_issue_f3, ticket_number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form3Pk other = (Form3Pk) obj;
		return Objects.equals(date_issue_f3, other.date_issue_f3) && Objects.equals(ticket_number, other.ticket_number);
	}

	@Override
	public String toString() {
		return "Form3Pk [ticket_number=" + ticket_number + ", date_issue_f3=" + date_issue_f3 + "]";
	}

}
