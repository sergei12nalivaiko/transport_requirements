package by.rw.tt.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import by.rw.tt.entity.sp.LgotSP;

@Entity
@Table(name = "TT_LGTT", schema = "TICKET")
public class ArmLGTTS implements Serializable {

	private static final long serialVersionUID = -3965356807814176258L;

	@Id
	@OneToOne(optional = true)
	@JoinColumn(name = "ID", referencedColumnName = "ID")
	private ArminoTT arminoTT;

	@Column(name = "MESIDX")
	private int mesidx;

	@ManyToOne
	@JoinColumn(name = "LGOT", referencedColumnName = "CODE_LGOT")
	private LgotSP lgotSP;

	@Column(name = "GOSLG")
	private String goslg;

	@Column(name = "GOSP")
	private String gosp;

	@Column(name = "DATA")
	@Temporal(TemporalType.DATE)
	private Date data;

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

	@Column(name = "FIO")
	private String fio;

	@Column(name = "GOSOTP")
	private String gosotp;

	@Column(name = "GOSNAZ")
	private String gosnaz;

	@Column(name = "DORF")
	private String dorf;

	@Column(name = "DATAOTP")
	@Temporal(TemporalType.DATE)
	private Date dataotp;

	@Column(name = "NOMBL")
	private String nombl;

	@Column(name = "NTERM")
	private String nterm;

	@Column(name = "STO")
	private String sto;

	@Column(name = "STN")
	private String stn;

	@Transient
	private String prim;

	public ArminoTT getArminoTT() {
		return arminoTT;
	}

	public void setArminoTT(ArminoTT arminoTT) {
		this.arminoTT = arminoTT;
	}

	public int getMesidx() {
		return mesidx;
	}

	public void setMesidx(int mesidx) {
		this.mesidx = mesidx;
	}

	public LgotSP getLgotSP() {
		return lgotSP;
	}

	public void setLgotSP(LgotSP lgotSP) {
		this.lgotSP = lgotSP;
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

	public String getDorf() {
		return dorf;
	}

	public void setDorf(String dorf) {
		this.dorf = dorf;
	}

	public Date getDataotp() {
		return dataotp;
	}

	public void setDataotp(Date dataotp) {
		this.dataotp = dataotp;
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

	public String getPrim() {
		return prim;
	}

	public void setPrim(String prim) {
		this.prim = prim;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arminoTT, data, dataotp, dorf, fio, goslg, gosnaz, gosotp, gosp, kolsh, lgotSP, mesidx, nds,
				nombl, nterm, pl, prim, sbil, sbili, stannaz, stanotp, stn, sto, trtreb);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArmLGTTS other = (ArmLGTTS) obj;
		return Objects.equals(arminoTT, other.arminoTT) && Objects.equals(data, other.data)
				&& Objects.equals(dataotp, other.dataotp) && Objects.equals(dorf, other.dorf)
				&& Objects.equals(fio, other.fio) && Objects.equals(goslg, other.goslg)
				&& Objects.equals(gosnaz, other.gosnaz) && Objects.equals(gosotp, other.gosotp)
				&& Objects.equals(gosp, other.gosp)
				&& Double.doubleToLongBits(kolsh) == Double.doubleToLongBits(other.kolsh)
				&& Objects.equals(lgotSP, other.lgotSP) && mesidx == other.mesidx
				&& Double.doubleToLongBits(nds) == Double.doubleToLongBits(other.nds)
				&& Objects.equals(nombl, other.nombl) && Objects.equals(nterm, other.nterm)
				&& Double.doubleToLongBits(pl) == Double.doubleToLongBits(other.pl) && Objects.equals(prim, other.prim)
				&& Double.doubleToLongBits(sbil) == Double.doubleToLongBits(other.sbil)
				&& Double.doubleToLongBits(sbili) == Double.doubleToLongBits(other.sbili)
				&& Objects.equals(stannaz, other.stannaz) && Objects.equals(stanotp, other.stanotp)
				&& Objects.equals(stn, other.stn) && Objects.equals(sto, other.sto)
				&& Objects.equals(trtreb, other.trtreb);
	}

	@Override
	public String toString() {
		return "ArminoLGTT [arminoTT=" + arminoTT + ", mesidx=" + mesidx + ", lgotSP=" + lgotSP + ", goslg=" + goslg
				+ ", gosp=" + gosp + ", data=" + data + ", stanotp=" + stanotp + ", stannaz=" + stannaz + ", kolsh="
				+ kolsh + ", trtreb=" + trtreb + ", sbil=" + sbil + ", sbili=" + sbili + ", pl=" + pl + ", nds=" + nds
				+ ", fio=" + fio + ", gosotp=" + gosotp + ", gosnaz=" + gosnaz + ", dorf=" + dorf + ", dataotp="
				+ dataotp + ", nombl=" + nombl + ", nterm=" + nterm + ", sto=" + sto + ", stn=" + stn + ", prim=" + prim
				+ "]";
	}

}
