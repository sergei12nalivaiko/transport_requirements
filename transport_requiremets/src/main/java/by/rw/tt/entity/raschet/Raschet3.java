package by.rw.tt.entity.raschet;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TT_RASCHET3", schema="TICKET")
public class Raschet3 implements Serializable{
	
	private static final long serialVersionUID = -4144604277868182946L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	@Column(name="FIRST_DAY")
	@Temporal(TemporalType.DATE)
	private Date first_day;
	
	@Column(name="LAST_DAY")
	@Temporal(TemporalType.DATE)
	private Date last_day;

	@Column(name="FORM")
	private String form;
	
	@Column(name="TRTREB")
	private String trtreb;
	
	@Column(name="DATAO")
	@Temporal(TemporalType.DATE)
	private Date datao;
	
	@Column(name="GOSLG")
	private String goslg;
	
	@Column(name="SUMPRC")
	private double sumprc;
	
	@Column(name="SUMPR")
	private double sumpr;
	
	@Column(name="PRIM")
	private String prim;

	@Column(name="VS")
	private String vs;
	
	@Column(name="LGOT")
	private String lgot;
	
	@Column(name="FIO")
	private String fio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFirst_day() {
		return first_day;
	}

	public void setFirst_day(Date first_day) {
		this.first_day = first_day;
	}

	public Date getLast_day() {
		return last_day;
	}

	public void setLast_day(Date last_day) {
		this.last_day = last_day;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getTrtreb() {
		return trtreb;
	}

	public void setTrtreb(String trtreb) {
		this.trtreb = trtreb;
	}

	public Date getDatao() {
		return datao;
	}

	public void setDatao(Date datao) {
		this.datao = datao;
	}

	public String getGoslg() {
		return goslg;
	}

	public void setGoslg(String goslg) {
		this.goslg = goslg;
	}

	public double getSumprc() {
		return sumprc;
	}

	public void setSumprc(double sumprc) {
		this.sumprc = sumprc;
	}

	public double getSumpr() {
		return sumpr;
	}

	public void setSumpr(double sumpr) {
		this.sumpr = sumpr;
	}

	public String getPrim() {
		return prim;
	}

	public void setPrim(String prim) {
		this.prim = prim;
	}

	public String getVs() {
		return vs;
	}

	public void setVs(String vs) {
		this.vs = vs;
	}

	public String getLgot() {
		return lgot;
	}

	public void setLgot(String lgot) {
		this.lgot = lgot;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(datao, fio, first_day, form, goslg, id, last_day, lgot, prim, sumpr, sumprc, trtreb, vs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Raschet3 other = (Raschet3) obj;
		return Objects.equals(datao, other.datao) && Objects.equals(fio, other.fio)
				&& Objects.equals(first_day, other.first_day) && Objects.equals(form, other.form)
				&& Objects.equals(goslg, other.goslg) && id == other.id && Objects.equals(last_day, other.last_day)
				&& Objects.equals(lgot, other.lgot) && Objects.equals(prim, other.prim)
				&& Double.doubleToLongBits(sumpr) == Double.doubleToLongBits(other.sumpr)
				&& Double.doubleToLongBits(sumprc) == Double.doubleToLongBits(other.sumprc)
				&& Objects.equals(trtreb, other.trtreb) && Objects.equals(vs, other.vs);
	}

	@Override
	public String toString() {
		return "Raschet3 [id=" + id + ", first_day=" + first_day + ", last_day=" + last_day + ", form=" + form
				+ ", trtreb=" + trtreb + ", datao=" + datao + ", goslg=" + goslg + ", sumprc=" + sumprc + ", sumpr="
				+ sumpr + ", prim=" + prim + ", vs=" + vs + ", lgot=" + lgot + ", fio=" + fio + "]";
	}
}
