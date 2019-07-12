package np.edu.nast.portfoliotracker.entities;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_transactions")
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	private BigInteger transactionId;

	@Column(name = "transaction_date", nullable = false)
	private Date transactionDate;

	@Column(name = "bank_id", nullable = false)
	private BigInteger bankId;

	@Column(name = "particular")
	private String particular;

	@Column(name = "credit")
	private BigInteger credit;

	@Column(name = "debit")
	private BigInteger debit;

	@Column(name = "remarks")
	private String remarks;

	public Transactions() {
		super();
	}

	public BigInteger getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(BigInteger transactionId) {
		this.transactionId = transactionId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigInteger getBankId() {
		return bankId;
	}

	public void setBankId(BigInteger bankId) {
		this.bankId = bankId;
	}

	public String getParticular() {
		return particular;
	}

	public void setParticular(String particular) {
		this.particular = particular;
	}

	public BigInteger getCredit() {
		return credit;
	}

	public void setCredit(BigInteger credit) {
		this.credit = credit;
	}

	public BigInteger getDebit() {
		return debit;
	}

	public void setDebit(BigInteger debit) {
		this.debit = debit;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
