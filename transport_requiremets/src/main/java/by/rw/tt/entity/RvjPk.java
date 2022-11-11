package by.rw.tt.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class RvjPk implements Serializable {

	private static final long serialVersionUID = 465505064327791644L;

	@Column(name = "TRTREB")
	private String trtreb; // номер транспортного требования

	@Column(name = "DATAV")
	@Temporal(TemporalType.DATE)
	private Date datav; // дата возврата проездного документа

	@Column(name = "NOMBL")
	private String nombl; // серия и номер бланка проездного документа

	public RvjPk() {
		super();
	}

	public RvjPk(String trtreb, Date datav, String nombl) {
		super();
		this.trtreb = trtreb;
		this.datav = datav;
		this.nombl = nombl;
	}

	public String getTrtreb() {
		return trtreb;
	}

	public void setTrtreb(String trtreb) {
		this.trtreb = trtreb;
	}

	public Date getDatav() {
		return datav;
	}

	public void setDatav(Date datav) {
		this.datav = datav;
	}

	public String getNombl() {
		return nombl;
	}

	public void setNombl(String nombl) {
		this.nombl = nombl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datav, nombl, trtreb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RvjPk other = (RvjPk) obj;
		return Objects.equals(datav, other.datav) && Objects.equals(nombl, other.nombl)
				&& Objects.equals(trtreb, other.trtreb);
	}

	@Override
	public String toString() {
		return "RvjPk [trtreb=" + trtreb + ", datav=" + datav + ", nombl=" + nombl + "]";
	}

}
