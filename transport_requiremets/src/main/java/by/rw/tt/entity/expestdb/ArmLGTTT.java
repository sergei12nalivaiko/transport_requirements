package by.rw.tt.entity.expestdb;

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
@Table(name = "ARMLGTTT", schema = "EXPEST")
public class ArmLGTTT implements Serializable {

	private static final long serialVersionUID = 994792528396656938L;

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "MESIDX")
	private int mesidx;

	@Column(name = "LGOT")
	private String lgot;

	@Column(name = "GOSLG")
	private String goslg;

	@Column(name = "GOSP")
	private String gosp;

	@Column(name = "DATA")
	@Temporal(TemporalType.DATE)
	private Date data;

	@Column(name = "DATAOTP")
	@Temporal(TemporalType.DATE)
	private Date dataotp;

	@Column(name = "STANOTP")
	private String stanotp;

	@Column(name = "STANNAZ")
	private String stannaz;

	@Column(name = "KOLSH")
	private double kolsh;

	@Column(name = "TRTREB")
	private String trtreb;

	@Column(name = "SBIL")
	private double sbil;

	@Column(name = "SBILI")
	private double sbili;

	@Column(name = "PL")
	private double pl;

	@Column(name = "NDS")
	private double nds;

	/*
	 * @Column(name = "TIPNAD") private String tipnad;
	 */

	@Column(name = "FIO")
	private String fio;

	@Column(name = "DORF")
	private String dorf;

	@Column(name = "GOSOTP")
	private String gosotp;

	@Column(name = "GOSNAZ")
	private String gosnaz;

	@Column(name = "NOMBL")
	private String nombl;

	@Column(name = "NTERM")
	private String nterm;

	@Column(name = "STO")
	private String sto;

	@Column(name = "STN")
	private String stn;

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

	public String getLgot() {
		return lgot;
	}

	public void setLgot(String lgot) {
		this.lgot = lgot;
	}

	public String getGoslg() {
		return goslg;
	}

	public void setGoslg(String goslg) {
		this.goslg = goslg;
	}

	public String getGosp() {
		return gosp;
	}

	public void setGosp(String gosp) {
		this.gosp = gosp;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Date getDataotp() {
		return dataotp;
	}

	public void setDataotp(Date dataotp) {
		this.dataotp = dataotp;
	}

	public String getStanotp() {
		return stanotp;
	}

	public void setStanotp(String stanotp) {
		this.stanotp = stanotp;
	}

	public String getStannaz() {
		return stannaz;
	}

	public void setStannaz(String stannaz) {
		this.stannaz = stannaz;
	}

	public double getKolsh() {
		return kolsh;
	}

	public void setKolsh(double kolsh) {
		this.kolsh = kolsh;
	}

	public String getTrtreb() {
		return trtreb;
	}

	public void setTrtreb(String trtreb) {
		this.trtreb = trtreb;
	}

	public double getSbil() {
		return sbil;
	}

	public void setSbil(double sbil) {
		this.sbil = sbil;
	}

	public double getSbili() {
		return sbili;
	}

	public void setSbili(double sbili) {
		this.sbili = sbili;
	}

	public double getPl() {
		return pl;
	}

	public void setPl(double pl) {
		this.pl = pl;
	}

	public double getNds() {
		return nds;
	}

	public void setNds(double nds) {
		this.nds = nds;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public String getDorf() {
		return dorf;
	}

	public void setDorf(String dorf) {
		this.dorf = dorf;
	}

	public String getGosotp() {
		return gosotp;
	}

	public void setGosotp(String gosotp) {
		this.gosotp = gosotp;
	}

	public String getGosnaz() {
		return gosnaz;
	}

	public void setGosnaz(String gosnaz) {
		this.gosnaz = gosnaz;
	}

	public String getNombl() {
		return nombl;
	}

	public void setNombl(String nombl) {
		this.nombl = nombl;
	}

	public String getNterm() {
		return nterm;
	}

	public void setNterm(String nterm) {
		this.nterm = nterm;
	}

	public String getSto() {
		return sto;
	}

	public void setSto(String sto) {
		this.sto = sto;
	}

	public String getStn() {
		return stn;
	}

	public void setStn(String stn) {
		this.stn = stn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, dataotp, dorf, fio, goslg, gosnaz, gosotp, gosp, id, kolsh, lgot, mesidx, nds, nombl,
				nterm, pl, sbil, sbili, stannaz, stanotp, stn, sto, trtreb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArmLGTTT other = (ArmLGTTT) obj;
		return Objects.equals(data, other.data) && Objects.equals(dataotp, other.dataotp)
				&& Objects.equals(dorf, other.dorf) && Objects.equals(fio, other.fio)
				&& Objects.equals(goslg, other.goslg) && Objects.equals(gosnaz, other.gosnaz)
				&& Objects.equals(gosotp, other.gosotp) && Objects.equals(gosp, other.gosp) && id == other.id
				&& Double.doubleToLongBits(kolsh) == Double.doubleToLongBits(other.kolsh)
				&& Objects.equals(lgot, other.lgot) && mesidx == other.mesidx
				&& Double.doubleToLongBits(nds) == Double.doubleToLongBits(other.nds)
				&& Objects.equals(nombl, other.nombl) && Objects.equals(nterm, other.nterm)
				&& Double.doubleToLongBits(pl) == Double.doubleToLongBits(other.pl)
				&& Double.doubleToLongBits(sbil) == Double.doubleToLongBits(other.sbil)
				&& Double.doubleToLongBits(sbili) == Double.doubleToLongBits(other.sbili)
				&& Objects.equals(stannaz, other.stannaz) && Objects.equals(stanotp, other.stanotp)
				&& Objects.equals(stn, other.stn) && Objects.equals(sto, other.sto)
				&& Objects.equals(trtreb, other.trtreb);
	}

	@Override
	public String toString() {
		return "ArmLGTTT [id=" + id + ", mesidx=" + mesidx + ", lgot=" + lgot + ", goslg=" + goslg + ", gosp=" + gosp
				+ ", data=" + data + ", dataotp=" + dataotp + ", stanotp=" + stanotp + ", stannaz=" + stannaz
				+ ", kolsh=" + kolsh + ", trtreb=" + trtreb + ", sbil=" + sbil + ", sbili=" + sbili + ", pl=" + pl
				+ ", nds=" + nds + ", fio=" + fio + ", dorf=" + dorf + ", gosotp=" + gosotp + ", gosnaz=" + gosnaz
				+ ", nombl=" + nombl + ", nterm=" + nterm + ", sto=" + sto + ", stn=" + stn + "]";
	}

}
