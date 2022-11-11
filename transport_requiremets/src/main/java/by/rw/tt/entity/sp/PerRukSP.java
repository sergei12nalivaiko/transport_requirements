package by.rw.tt.entity.sp;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SP_PER_RUK", schema = "TICKET")
public class PerRukSP implements Serializable {

	private static final long serialVersionUID = -43030742181735599L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PER_RUK")
	private Integer idperruk;

	@Column(name = "FIO")
	private String fio;

	@Column(name = "DOL")
	private String dol;

	public PerRukSP() {
		super();
	}

	public PerRukSP(Integer idperruk, String fio, String dol) {
		super();
		this.idperruk = idperruk;
		this.fio = fio;
		this.dol = dol;
	}

	public Integer getIdperruk() {
		return idperruk;
	}

	public void setIdperruk(Integer idperruk) {
		this.idperruk = idperruk;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getDol() {
		return dol;
	}

	public void setDol(String dol) {
		this.dol = dol;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dol, fio, idperruk);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PerRukSP other = (PerRukSP) obj;
		return Objects.equals(dol, other.dol) && Objects.equals(fio, other.fio)
				&& Objects.equals(idperruk, other.idperruk);
	}

	@Override
	public String toString() {
		return "PerRukSP [idperruk=" + idperruk + ", fio=" + fio + ", dol=" + dol + "]";
	}
}
