package by.rw.tt.entity.raschet;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="TT_RASCHET1",schema="TICKET")
public class Raschet1 implements Serializable{
	
	private static final long serialVersionUID = -2767454477874319866L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name = "FIRST_DAY")
	@Temporal(TemporalType.DATE)
	private Date firstDay;
	
	@Column(name = "LAST_DAY")
	@Temporal(TemporalType.DATE)
	private Date lastDay;
	
	@Column(name = "TIPNAD")
	private String tipnad;
	
	@Column(name = "FORM")
	private String form;

	@Column(name = "TRTREB")
	private String trtreb;
	
	@Column(name = "DATAO")
	@Temporal(TemporalType.DATE)
	private Date datao;
	
	@Column(name = "STO")
	private String sto;
	
	@Column(name = "STN")
	private String stn;
	
	@Column(name = "STANOTP")
	private String stanotp;
	
	@Column(name = "STANNAZ")
	private String stannaz;

	@Column(name="SUMPR")
	private BigDecimal sumpr;

	@Column(name="SNDS")
	private double snds;
	
	@Column(name="SUMNDS")
	private double sumnds;
	
	@Column(name="SUMPRNDS")
	private double sumprnds;
	
	@Column(name = "KOLPASS")
	private double kolpass;
	
	@Column(name = "ORG_NUM")
	private String org_num;
	
	@Column(name="PRIM")
	private String prim;
	
	@Column(name="IST")
	private String ist;
	
	@Column(name="VS")
	private String vs;
	
	@Column(name="FIOPAS")
	private String fiopas;
	
	@Column(name = "DATAOTP")
	@Temporal(TemporalType.DATE)
	private Date dataotp;
	
	@Column(name="NPER")
	private int nper;
	
	@Column(name = "LGOT")
	private String lgot;
	
	@Column(name = "NOD_ORG")
	private String nodOrg;
	
	/*@Column(name = "NOD_CODE")
	private String nod_code;*/

	@Column(name="SUMPRBCH")
	private double sumprbch;

	@Column(name = "DORF")
	private String dorf;

	@Column(name = "CODE_STATUS")
	private int codeStatus;
	
	@Column(name="ID_PERSON")
	private String idPerson;
	
	@Column(name="ID_RECORD")
	private int idRecord;
	
	@Column(name="SECOND_FORM")
	private String secondForm;

	public Raschet1() {
		super();
	}

	public Raschet1(int id, Date firstDay, Date lastDay, String tipnad, String form, String trtreb, Date datao,
			String sto, String stn, String stanotp, String stannaz, BigDecimal sumpr, double snds, double sumnds,
			double sumprnds, double kolpass, String org_num, String prim, String ist, String vs, String fiopas,
			Date dataotp, int nper, String lgot, String nodOrg, double sumprbch, String dorf, int codeStatus,
			String idPerson, int idRecord, String secondForm) {
		super();
		this.id = id;
		this.firstDay = firstDay;
		this.lastDay = lastDay;
		this.tipnad = tipnad;
		this.form = form;
		this.trtreb = trtreb;
		this.datao = datao;
		this.sto = sto;
		this.stn = stn;
		this.stanotp = stanotp;
		this.stannaz = stannaz;
		this.sumpr = sumpr;
		this.snds = snds;
		this.sumnds = sumnds;
		this.sumprnds = sumprnds;
		this.kolpass = kolpass;
		this.org_num = org_num;
		this.prim = prim;
		this.ist = ist;
		this.vs = vs;
		this.fiopas = fiopas;
		this.dataotp = dataotp;
		this.nper = nper;
		this.lgot = lgot;
		this.nodOrg = nodOrg;
		this.sumprbch = sumprbch;
		this.dorf = dorf;
		this.codeStatus = codeStatus;
		this.idPerson = idPerson;
		this.idRecord = idRecord;
		this.secondForm = secondForm;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codeStatus, datao, dataotp, dorf, fiopas, firstDay, form, id, idPerson, idRecord, ist,
				kolpass, lastDay, lgot, nodOrg, nper, org_num, prim, secondForm, snds, stannaz, stanotp, stn, sto,
				sumnds, sumpr, sumprbch, sumprnds, tipnad, trtreb, vs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Raschet1 other = (Raschet1) obj;
		return codeStatus == other.codeStatus && Objects.equals(datao, other.datao)
				&& Objects.equals(dataotp, other.dataotp) && Objects.equals(dorf, other.dorf)
				&& Objects.equals(fiopas, other.fiopas) && Objects.equals(firstDay, other.firstDay)
				&& Objects.equals(form, other.form) && id == other.id && Objects.equals(idPerson, other.idPerson)
				&& idRecord == other.idRecord && Objects.equals(ist, other.ist)
				&& Double.doubleToLongBits(kolpass) == Double.doubleToLongBits(other.kolpass)
				&& Objects.equals(lastDay, other.lastDay) && Objects.equals(lgot, other.lgot)
				&& Objects.equals(nodOrg, other.nodOrg) && nper == other.nper && Objects.equals(org_num, other.org_num)
				&& Objects.equals(prim, other.prim) && Objects.equals(secondForm, other.secondForm)
				&& Double.doubleToLongBits(snds) == Double.doubleToLongBits(other.snds)
				&& Objects.equals(stannaz, other.stannaz) && Objects.equals(stanotp, other.stanotp)
				&& Objects.equals(stn, other.stn) && Objects.equals(sto, other.sto)
				&& Double.doubleToLongBits(sumnds) == Double.doubleToLongBits(other.sumnds)
				&& Objects.equals(sumpr, other.sumpr)
				&& Double.doubleToLongBits(sumprbch) == Double.doubleToLongBits(other.sumprbch)
				&& Double.doubleToLongBits(sumprnds) == Double.doubleToLongBits(other.sumprnds)
				&& Objects.equals(tipnad, other.tipnad) && Objects.equals(trtreb, other.trtreb)
				&& Objects.equals(vs, other.vs);
	}

	@Override
	public String toString() {
		return "Raschet1 [id=" + id + ", firstDay=" + firstDay + ", lastDay=" + lastDay + ", tipnad=" + tipnad
				+ ", form=" + form + ", trtreb=" + trtreb + ", datao=" + datao + ", sto=" + sto + ", stn=" + stn
				+ ", stanotp=" + stanotp + ", stannaz=" + stannaz + ", sumpr=" + sumpr + ", snds=" + snds + ", sumnds="
				+ sumnds + ", sumprnds=" + sumprnds + ", kolpass=" + kolpass + ", org_num=" + org_num + ", prim=" + prim
				+ ", ist=" + ist + ", vs=" + vs + ", fiopas=" + fiopas + ", dataotp=" + dataotp + ", nper=" + nper
				+ ", lgot=" + lgot + ", nodOrg=" + nodOrg + ", sumprbch=" + sumprbch + ", dorf=" + dorf
				+ ", codeStatus=" + codeStatus + ", idPerson=" + idPerson + ", idRecord=" + idRecord + ", secondForm="
				+ secondForm + "]";
	}
	
}
