package by.rw.tt.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TT_RVJ", schema = "TICKET")
public class Rvj implements Serializable{

	private static final long serialVersionUID = -4212648271385129021L;

	@EmbeddedId
	private RvjPk rvjPk;

	@Column(name = "MESIDX")
	@Temporal(TemporalType.DATE)
	private Date mesidx; // первый день отчетного мес€ца

	@Column(name = "GOSP")
	private String gosp; // железнодорожна€ администраци€ оформивша€ проездной документ

	@Column(name = "GOSLG")
	private String goslg; // железнодорожна€ администраци€ выдавша€ транспортное требование

	@Column(name = "NAMJD")
	private String namjd; // форма транспортного требовани€

	@Column(name = "DATAO")
	@Temporal(TemporalType.DATE)
	private Date datao; // дата оформлени€ проездного документа

	@Column(name = "DOKL")
	private String dokl; // сери€ и номер документа удостовер€ющего личность

	@Column(name = "FIO")
	private String fio; // фамили€ и инициалы пассажира

	@Column(name = "VRMVZ")
	private Time vrmvz; // врем€ возврата проездного документа

	@Column(name = "DATAOTP")
	@Temporal(TemporalType.DATE)
	private Date dataotp; // дата отправлени€

	@Column(name = "PZD")
	private String pzd; // номер поезда

	@Column(name = "TVAG")
	private String tvag; // категори€ вагона

	@Column(name = "STO")
	private String sto; // станци€ отправлени€

	@Column(name = "STN")
	private String stn; // станци€ назначени€

	@Column(name = "STNPR")
	private String stnpr; // станци€ прерывани€ поездки

	@Column(name = "KOLSH")
	private BigDecimal kolsh; // количество человек

	@Column(name = "SBILS")
	private BigDecimal sbils; // всего в шв.фр.

	@Column(name = "PL")
	private BigDecimal pl; // всего в шв.фр.

	@Column(name = "NDS")
	private BigDecimal nds; // в том числе Ќƒ—

	@Column(name = "BCHPART")
	private BigDecimal bchpart;

	public Rvj() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rvj(RvjPk rvjPk, Date mesidx, String gosp, String goslg, String namjd, Date datao, String dokl, String fio,
			Time vrmvz, Date dataotp, String pzd, String tvag, String sto, String stn, String stnpr, BigDecimal kolsh,
			BigDecimal sbils, BigDecimal pl, BigDecimal nds, BigDecimal bchpart) {
		super();
		this.rvjPk = rvjPk;
		this.mesidx = mesidx;
		this.gosp = gosp;
		this.goslg = goslg;
		this.namjd = namjd;
		this.datao = datao;
		this.dokl = dokl;
		this.fio = fio;
		this.vrmvz = vrmvz;
		this.dataotp = dataotp;
		this.pzd = pzd;
		this.tvag = tvag;
		this.sto = sto;
		this.stn = stn;
		this.stnpr = stnpr;
		this.kolsh = kolsh;
		this.sbils = sbils;
		this.pl = pl;
		this.nds = nds;
		this.bchpart = bchpart;
	}

	public RvjPk getRvjPk() {
		return rvjPk;
	}

	public void setRvjPk(RvjPk rvjPk) {
		this.rvjPk = rvjPk;
	}

	public Date getMesidx() {
		return mesidx;
	}

	public void setMesidx(Date mesidx) {
		this.mesidx = mesidx;
	}

	public String getGosp() {
		return gosp;
	}

	public void setGosp(String gosp) {
		this.gosp = gosp;
	}

	public String getGoslg() {
		return goslg;
	}

	public void setGoslg(String goslg) {
		this.goslg = goslg;
	}

	public String getNamjd() {
		return namjd;
	}

	public void setNamjd(String namjd) {
		this.namjd = namjd;
	}

	public Date getDatao() {
		return datao;
	}

	public void setDatao(Date datao) {
		this.datao = datao;
	}

	public String getDokl() {
		return dokl;
	}

	public void setDokl(String dokl) {
		this.dokl = dokl;
	}

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public Time getVrmvz() {
		return vrmvz;
	}

	public void setVrmvz(Time vrmvz) {
		this.vrmvz = vrmvz;
	}

	public Date getDataotp() {
		return dataotp;
	}

	public void setDataotp(Date dataotp) {
		this.dataotp = dataotp;
	}

	public String getPzd() {
		return pzd;
	}

	public void setPzd(String pzd) {
		this.pzd = pzd;
	}

	public String getTvag() {
		return tvag;
	}

	public void setTvag(String tvag) {
		this.tvag = tvag;
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

	public String getStnpr() {
		return stnpr;
	}

	public void setStnpr(String stnpr) {
		this.stnpr = stnpr;
	}

	public BigDecimal getKolsh() {
		return kolsh;
	}

	public void setKolsh(BigDecimal kolsh) {
		this.kolsh = kolsh;
	}

	public BigDecimal getSbils() {
		return sbils;
	}

	public void setSbils(BigDecimal sbils) {
		this.sbils = sbils;
	}

	public BigDecimal getPl() {
		return pl;
	}

	public void setPl(BigDecimal pl) {
		this.pl = pl;
	}

	public BigDecimal getNds() {
		return nds;
	}

	public void setNds(BigDecimal nds) {
		this.nds = nds;
	}

	public BigDecimal getBchpart() {
		return bchpart;
	}

	public void setBchpart(BigDecimal bchpart) {
		this.bchpart = bchpart;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bchpart, datao, dataotp, dokl, fio, goslg, gosp, kolsh, mesidx, namjd, nds, pl, pzd, rvjPk,
				sbils, stn, stnpr, sto, tvag, vrmvz);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rvj other = (Rvj) obj;
		return Objects.equals(bchpart, other.bchpart) && Objects.equals(datao, other.datao)
				&& Objects.equals(dataotp, other.dataotp) && Objects.equals(dokl, other.dokl)
				&& Objects.equals(fio, other.fio) && Objects.equals(goslg, other.goslg)
				&& Objects.equals(gosp, other.gosp) && Objects.equals(kolsh, other.kolsh)
				&& Objects.equals(mesidx, other.mesidx) && Objects.equals(namjd, other.namjd)
				&& Objects.equals(nds, other.nds) && Objects.equals(pl, other.pl) && Objects.equals(pzd, other.pzd)
				&& Objects.equals(rvjPk, other.rvjPk) && Objects.equals(sbils, other.sbils)
				&& Objects.equals(stn, other.stn) && Objects.equals(stnpr, other.stnpr)
				&& Objects.equals(sto, other.sto) && Objects.equals(tvag, other.tvag)
				&& Objects.equals(vrmvz, other.vrmvz);
	}

	@Override
	public String toString() {
		return "Rvj [rvjPk=" + rvjPk + ", mesidx=" + mesidx + ", gosp=" + gosp + ", goslg=" + goslg + ", namjd=" + namjd
				+ ", datao=" + datao + ", dokl=" + dokl + ", fio=" + fio + ", vrmvz=" + vrmvz + ", dataotp=" + dataotp
				+ ", pzd=" + pzd + ", tvag=" + tvag + ", sto=" + sto + ", stn=" + stn + ", stnpr=" + stnpr + ", kolsh="
				+ kolsh + ", sbils=" + sbils + ", pl=" + pl + ", nds=" + nds + ", bchpart=" + bchpart + "]";
	}

}
