package by.rw.tt.entity.person;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "SP_PERSON_STATUS", schema = "TICKET")
public class PersonStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "CODE_STATUS")
	private Integer code;

	@Column(name = "PERSON_STATUS")
	private String status;

	@Column(name = "STATUS_SIGN")
	private String sign;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, sign, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonStatus other = (PersonStatus) obj;
		return Objects.equals(code, other.code) && Objects.equals(sign, other.sign)
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "PersonStatus [code=" + code + ", status=" + status + ", sign=" + sign + "]";
	}
	
	
}
