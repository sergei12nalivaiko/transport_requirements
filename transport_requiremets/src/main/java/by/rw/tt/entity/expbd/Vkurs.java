package by.rw.tt.entity.expbd;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "VKURS", schema = "EXPBD")
public class Vkurs implements Serializable {

	private static final long serialVersionUID = 8839026759904801049L;

	@Id
	@Column(name = "DATAN")
	@Temporal(TemporalType.DATE)
	private Date datan;

	@Column(name = "DATAK")
	@Temporal(TemporalType.DATE)
	private Date datak;

	@Column(name = "KODG")
	private String kodg;

	@Column(name = "KURS")
	private double kurs;

	@Column(name = "OKR")
	private double okr;

	@Column(name = "NDS")
	private double nds;

	@Column(name = "KODV")
	private String kodv;

	@Column(name = "NAZV")
	private String nazv;

	public Vkurs() {
		super();
	}

	public Vkurs(Date datan, Date datak, String kodg, double kurs, double okr, double nds, String kodv, String nazv) {
		super();
		this.datan = datan;
		this.datak = datak;
		this.kodg = kodg;
		this.kurs = kurs;
		this.okr = okr;
		this.nds = nds;
		this.kodv = kodv;
		this.nazv = nazv;
	}

	public Date getDatan() {
		return datan;
	}

	public void setDatan(Date datan) {
		this.datan = datan;
	}

	public Date getDatak() {
		return datak;
	}

	public void setDatak(Date datak) {
		this.datak = datak;
	}

	public String getKodg() {
		return kodg;
	}

	public void setKodg(String kodg) {
		this.kodg = kodg;
	}

	public double getKurs() {
		return kurs;
	}

	public void setKurs(double kurs) {
		this.kurs = kurs;
	}

	public double getOkr() {
		return okr;
	}

	public void setOkr(double okr) {
		this.okr = okr;
	}

	public double getNds() {
		return nds;
	}

	public void setNds(double nds) {
		this.nds = nds;
	}

	public String getKodv() {
		return kodv;
	}

	public void setKodv(String kodv) {
		this.kodv = kodv;
	}

	public String getNazv() {
		return nazv;
	}

	public void setNazv(String nazv) {
		this.nazv = nazv;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datak, datan, kodg, kodv, kurs, nazv, nds, okr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vkurs other = (Vkurs) obj;
		return Objects.equals(datak, other.datak) && Objects.equals(datan, other.datan)
				&& Objects.equals(kodg, other.kodg) && Objects.equals(kodv, other.kodv)
				&& Double.doubleToLongBits(kurs) == Double.doubleToLongBits(other.kurs)
				&& Objects.equals(nazv, other.nazv)
				&& Double.doubleToLongBits(nds) == Double.doubleToLongBits(other.nds)
				&& Double.doubleToLongBits(okr) == Double.doubleToLongBits(other.okr);
	}

	@Override
	public String toString() {
		return "Vkurs [datan=" + datan + ", datak=" + datak + ", kodg=" + kodg + ", kurs=" + kurs + ", okr=" + okr
				+ ", nds=" + nds + ", kodv=" + kodv + ", nazv=" + nazv + "]";
	}

}
