package by.rw.tt.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "SP_ORGANIZATIONS", schema = "TICKET")
public class Organization implements Serializable {
	private static final long serialVersionUID = -8571625135087898581L;

	public Organization() {
		super();
	}

	public Organization(String number, TicketOffice ticketOffice, ConsolidatedOrg consOrg, String be, String shortName,
			String fullName, String totalName, String uNN, String address, String account, String bank, String mFO,
			String email, int liquidation, Date recordBgn, Date recordEnd, String nod) {
		super();
		this.number = number;
		this.ticketOffice = ticketOffice;
		this.consOrg = consOrg;
		this.be = be;
		this.shortName = shortName;
		this.fullName = fullName;
		this.totalName = totalName;
		UNN = uNN;
		this.address = address;
		this.account = account;
		this.bank = bank;
		MFO = mFO;
		this.email = email;
		this.liquidation = liquidation;
		this.recordBgn = recordBgn;
		this.recordEnd = recordEnd;
		this.nod = nod;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ORG")
	private int id;

	@Column(name = "ORG_NUM")
	@NotNull(message = "не может быть пустым.")
	@Pattern(regexp = "\\d{6}", message = "может состоять только из 6 цифр.")
	private String number;

	@ManyToOne
	@JoinColumn(name = "OFFICE_NUM", referencedColumnName = "OFFICE_NUM")
	private TicketOffice ticketOffice;

	@ManyToOne
	@JoinColumn(name = "ORG_NUM_CONS", referencedColumnName = "ORG_NUM")
	private ConsolidatedOrg consOrg;

	@Column(name = "ORG_NUM_BE")
	private String be;

	@Column(name = "SHORT_NAME")
	@NotNull(message = "не может быть пустым.")
	private String shortName;

	@Column(name = "FULL_NAME")
	@NotNull(message = "не может быть пустым.")
	private String fullName;

	@Column(name = "FULL_NAME_BE")
	private String totalName;

	@Column(name = "UNN")
	private String UNN;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "RCHET")
	private String account;

	@Column(name = "BANK")
	private String bank;

	@Column(name = "MFO")
	private String MFO;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "LIQUIDATION")
	private int liquidation;

	@Column(name = "RECORD_BGN")
	@Temporal(TemporalType.TIMESTAMP)
	private Date recordBgn;

	@Column(name = "RECORD_END")
	@Temporal(TemporalType.TIMESTAMP)
	private Date recordEnd;

	@Column(name = "NOD_CODE")
	private String nod;

	@Transient
	private String fullNameAndNumber;

	@Transient
	private Integer limitNod;

	@Transient
	private Integer limitDor;

	@Transient
	private Date curDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public TicketOffice getTicketOffice() {
		return ticketOffice;
	}

	public void setTicketOffice(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public ConsolidatedOrg getConsOrg() {
		return consOrg;
	}

	public void setConsOrg(ConsolidatedOrg consOrg) {
		this.consOrg = consOrg;
	}

	public String getBe() {
		return be;
	}

	public void setBe(String be) {
		this.be = be;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTotalName() {
		return totalName;
	}

	public void setTotalName(String totalName) {
		this.totalName = totalName;
	}

	public String getUNN() {
		return UNN;
	}

	public void setUNN(String uNN) {
		UNN = uNN;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getMFO() {
		return MFO;
	}

	public void setMFO(String mFO) {
		MFO = mFO;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLiquidation() {
		return liquidation;
	}

	public void setLiquidation(int liquidation) {
		this.liquidation = liquidation;
	}

	public Date getRecordBgn() {
		return recordBgn;
	}

	public void setRecordBgn(Date recordBgn) {
		this.recordBgn = recordBgn;
	}

	public Date getRecordEnd() {
		return recordEnd;
	}

	public void setRecordEnd(Date recordEnd) {
		this.recordEnd = recordEnd;
	}

	public String getNod() {
		return nod;
	}

	public void setNod(String nod) {
		this.nod = nod;
	}

	public String getFullNameAndNumber() {
		return fullNameAndNumber;
	}

	public void setFullNameAndNumber(String fullNameAndNumber) {
		this.fullNameAndNumber = fullNameAndNumber;
	}

	public Integer getLimitNod() {
		return limitNod;
	}

	public void setLimitNod(Integer limitNod) {
		this.limitNod = limitNod;
	}

	public Integer getLimitDor() {
		return limitDor;
	}

	public void setLimitDor(Integer limitDor) {
		this.limitDor = limitDor;
	}

	public Date getCurDate() {
		return curDate;
	}

	public void setCurDate(Date curDate) {
		this.curDate = curDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(MFO, UNN, account, address, bank, be, consOrg, curDate, email, fullName, fullNameAndNumber,
				id, limitDor, limitNod, liquidation, nod, number, recordBgn, recordEnd, shortName, ticketOffice,
				totalName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Organization other = (Organization) obj;
		return Objects.equals(MFO, other.MFO) && Objects.equals(UNN, other.UNN)
				&& Objects.equals(account, other.account) && Objects.equals(address, other.address)
				&& Objects.equals(bank, other.bank) && Objects.equals(be, other.be)
				&& Objects.equals(consOrg, other.consOrg) && Objects.equals(curDate, other.curDate)
				&& Objects.equals(email, other.email) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(fullNameAndNumber, other.fullNameAndNumber) && id == other.id
				&& Objects.equals(limitDor, other.limitDor) && Objects.equals(limitNod, other.limitNod)
				&& liquidation == other.liquidation && Objects.equals(nod, other.nod)
				&& Objects.equals(number, other.number) && Objects.equals(recordBgn, other.recordBgn)
				&& Objects.equals(recordEnd, other.recordEnd) && Objects.equals(shortName, other.shortName)
				&& Objects.equals(ticketOffice, other.ticketOffice) && Objects.equals(totalName, other.totalName);
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", number=" + number + ", ticketOffice=" + ticketOffice + ", consOrg="
				+ consOrg + ", be=" + be + ", shortName=" + shortName + ", fullName=" + fullName + ", totalName="
				+ totalName + ", UNN=" + UNN + ", address=" + address + ", account=" + account + ", bank=" + bank
				+ ", MFO=" + MFO + ", email=" + email + ", liquidation=" + liquidation + ", recordBgn=" + recordBgn
				+ ", recordEnd=" + recordEnd + ", nod=" + nod + ", fullNameAndNumber=" + fullNameAndNumber
				+ ", limitNod=" + limitNod + ", limitDor=" + limitDor + ", curDate=" + curDate + "]";
	}

}
