package by.rw.tt.entity.sp;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SP_LGOT", schema = "TICKET")
public class LgotSP implements Serializable {

	private static final long serialVersionUID = 4212240534787159979L;

	@Id
	@Column(name = "CODE_LGOT")
	private String code;

	@Column(name = "FORM")
	private String form;

	@Column(name = "TIPNAD")
	private char tipnad;

	@Column(name = "PS")
	private String ps;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public char getTipnad() {
		return tipnad;
	}

	public void setTipnad(char tipnad) {
		this.tipnad = tipnad;
	}

	public String getPs() {
		return ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, form, ps, tipnad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LgotSP other = (LgotSP) obj;
		return Objects.equals(code, other.code) && Objects.equals(form, other.form) && Objects.equals(ps, other.ps)
				&& tipnad == other.tipnad;
	}

	@Override
	public String toString() {
		return "LgotSP [code=" + code + ", form=" + form + ", tipnad=" + tipnad + ", ps=" + ps + "]";
	}

}
