package by.rw.tt.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TT_ARMINO", schema = "TICKET")
public class ArminoTT implements Serializable {

	private static final long serialVersionUID = 3730785591221569450L;

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "MESIDX")
	private int mesidx;

	@Column(name = "GOS")
	private String gos;

	@Column(name = "STANPR")
	private String stanpr;

	@Column(name = "SBIL")
	private double sbil;

	@Column(name = "PL")
	private double pl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMesidx() {
		return mesidx;
	}

	public void setMesidx(int mesidx) {
		this.mesidx = mesidx;
	}

	public String getGos() {
		return gos;
	}

	public void setGos(String gos) {
		this.gos = gos;
	}

	public String getStanpr() {
		return stanpr;
	}

	public void setStanpr(String stanpr) {
		this.stanpr = stanpr;
	}

	public double getSbil() {
		return sbil;
	}

	public void setSbil(double sbil) {
		this.sbil = sbil;
	}

	public double getPl() {
		return pl;
	}

	public void setPl(double pl) {
		this.pl = pl;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gos, id, mesidx, pl, sbil, stanpr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArminoTT other = (ArminoTT) obj;
		return Objects.equals(gos, other.gos) && id == other.id && mesidx == other.mesidx
				&& Double.doubleToLongBits(pl) == Double.doubleToLongBits(other.pl)
				&& Double.doubleToLongBits(sbil) == Double.doubleToLongBits(other.sbil)
				&& Objects.equals(stanpr, other.stanpr);
	}

	@Override
	public String toString() {
		return "ArminoTT [id=" + id + ", mesidx=" + mesidx + ", gos=" + gos + ", stanpr=" + stanpr + ", sbil=" + sbil
				+ ", pl=" + pl + "]";
	}

}
