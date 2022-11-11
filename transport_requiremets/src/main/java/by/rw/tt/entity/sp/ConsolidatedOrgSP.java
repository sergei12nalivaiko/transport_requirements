package by.rw.tt.entity.sp;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SP_CONSOLIDATED_ORG", schema = "TICKET")
public class ConsolidatedOrgSP implements Serializable {
	private static final long serialVersionUID = 9137414858272118688L;

	@Id
	@Column(name = "ORG_NUM")
	private String consOrgNum;

	@Column(name = "SHORT_NAME")
	private String shortName;

	@Column(name = "EMAIL")
	private String email;
	
	

	public ConsolidatedOrgSP() {
		super();
	}
	
	

	public ConsolidatedOrgSP(String consOrgNum, String shortName, String email) {
		super();
		this.consOrgNum = consOrgNum;
		this.shortName = shortName;
		this.email = email;
	}

	public String getConsOrgNum() {
		return consOrgNum;
	}

	public void setConsOrgNum(String consOrgNum) {
		this.consOrgNum = consOrgNum;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(consOrgNum, email, shortName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsolidatedOrgSP other = (ConsolidatedOrgSP) obj;
		return Objects.equals(consOrgNum, other.consOrgNum) && Objects.equals(email, other.email)
				&& Objects.equals(shortName, other.shortName);
	}

	@Override
	public String toString() {
		return "ConsolidatedOrg [consOrgNum=" + consOrgNum + ", shortName=" + shortName + ", email=" + email + "]";
	}
	
	
}

