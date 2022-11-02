package by.rw.tt.entity.raschet;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Raschet2Pk implements Serializable {

	private static final long serialVersionUID = 5435684409966847322L;

	@Column(name = "TIPNAD")
	private char tipnad;

	@Column(name = "FORM")
	private String form;

	@Column(name = "IST")
	private String ist;

	@Column(name = "VS")
	private String vs;

	@Column(name = "ORG_NUM")
	private String org_num;

	@Column(name = "SUMPR")
	private double sumpr;

	@Column(name = "SNDS")
	private double snds;

	@Column(name = "SUMNDS")
	private double sumnds;

	@Column(name = "SUMPRNDS")
	private double sumprnds;

	@Column(name = "KOLPASS")
	private double kolpass;

	/*
	 * @Column(name="NOD_CODE") private String nod_code;
	 */

	@Column(name = "NOD_ORG")
	private String nod_org;

	@Column(name = "NPER")
	private int nper;

	public Raschet2Pk() {
		super();
	}

	public Raschet2Pk(char tipnad, String form, String ist, String vs, String org_num, double sumpr, double snds,
			double sumnds, double sumprnds, double kolpass, String nod_org, int nper) {
		super();
		this.tipnad = tipnad;
		this.form = form;
		this.ist = ist;
		this.vs = vs;
		this.org_num = org_num;
		this.sumpr = sumpr;
		this.snds = snds;
		this.sumnds = sumnds;
		this.sumprnds = sumprnds;
		this.kolpass = kolpass;
		this.nod_org = nod_org;
		this.nper = nper;
	}

	@Override
	public int hashCode() {
		return Objects.hash(form, ist, kolpass, nod_org, nper, org_num, snds, sumnds, sumpr, sumprnds, tipnad, vs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Raschet2Pk other = (Raschet2Pk) obj;
		return Objects.equals(form, other.form) && Objects.equals(ist, other.ist)
				&& Double.doubleToLongBits(kolpass) == Double.doubleToLongBits(other.kolpass)
				&& Objects.equals(nod_org, other.nod_org) && nper == other.nper
				&& Objects.equals(org_num, other.org_num)
				&& Double.doubleToLongBits(snds) == Double.doubleToLongBits(other.snds)
				&& Double.doubleToLongBits(sumnds) == Double.doubleToLongBits(other.sumnds)
				&& Double.doubleToLongBits(sumpr) == Double.doubleToLongBits(other.sumpr)
				&& Double.doubleToLongBits(sumprnds) == Double.doubleToLongBits(other.sumprnds)
				&& tipnad == other.tipnad && Objects.equals(vs, other.vs);
	}

	@Override
	public String toString() {
		return "Raschet2Pk [tipnad=" + tipnad + ", form=" + form + ", ist=" + ist + ", vs=" + vs + ", org_num="
				+ org_num + ", sumpr=" + sumpr + ", snds=" + snds + ", sumnds=" + sumnds + ", sumprnds=" + sumprnds
				+ ", kolpass=" + kolpass + ", nod_org=" + nod_org + ", nper=" + nper + "]";
	}

}
