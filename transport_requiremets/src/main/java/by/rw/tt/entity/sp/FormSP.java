package by.rw.tt.entity.sp;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SP_FORMS", schema="TICKET")
public class FormSP implements Serializable {

	private static final long serialVersionUID = -4753884638203173277L;

	@Id
	@Column(name = "CODE")
	private int code;

	@Column(name = "FORM")
	private String form;

	public FormSP() {
		super();
	}

	public FormSP(int code, String form) {
		super();
		this.code = code;
		this.form = form;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, form);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormSP other = (FormSP) obj;
		return code == other.code && Objects.equals(form, other.form);
	}

	@Override
	public String toString() {
		return "FormSP [code=" + code + ", form=" + form + "]";
	}

}
