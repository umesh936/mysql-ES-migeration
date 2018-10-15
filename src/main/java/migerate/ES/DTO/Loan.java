package migerate.ES.DTO;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class Loan {

	private String loanExternalId = null;
	private String mambuLoanId = null;
	private String mambuCustomerId = null;
	private String orderId = null;
	private String accountHolderName = null;
	public BigDecimal loanAmount;
	private String customerId = null;
	private String customerEmail = null;
	private String merchantName = null;
	private String merchantId = null;
	private Integer numberOfInstallments;
	private BigDecimal numberOfPaidInstallments;
	private BigDecimal downPayment;
	private BigDecimal downPaymentRate;
	private String modeOfPayment = null;
	// private Boolean depositPaid;
	private BigDecimal processingFee;
	private BigDecimal processingFeeRate;
	private BigDecimal interestRate;
	private Long interestType;
	private String isLoanArrear = null;
	private BigDecimal interestAmount;
	private BigDecimal principleDue;
	private String deliveryStatus = null;
	private BigDecimal interestDue;
	private BigDecimal penaltyDue;
	private BigDecimal feeDue;
	private String ip = null;
	private String preAcceptRiskRejectionReason = null;
	private String nachVerficationStatus = null;
	private String nachRegisterationId = null;
	private String fullName = null;
	private String city = null;
	private String addressLine1 = null;
	private String addressLine2 = null;
	private String pinCode = null;
	private Date refundInitiatedDate;
	private Double refundInitiatedAmount; // not being set in lender dashboard
											// also
	private Date loanAgreementAcceptedDate;
	private Date loanApprovedDate;
	private Date deliveryDate;
	private Date activationDate;
	private Date closedDate;
	private BigDecimal basketSize;
	private String loanStatus = null;
	private String loanApplicationStatus = null;
	private BigDecimal emiAmount;
	private List<String> emiScheduleDateList;
	private String currentAssignedLender = null;
	private Date createdOn;
	private BigDecimal refundAmount;
	private Date refundProcessedOn;
	private Date partialRefundLastProcessedOn;
	private String partialRefundId = null;
	private String refundReason = null;
	private String bankAccountHoldersName = null;
	private String bankId = null;
	private String bankAccountNumber = null;
	private String bankIFSC = null;
	private Integer bankAccountType;
	private String customBankName = null;
	private Integer bankDetailsSource;
	private String bankName = null;
	private String cibilScore = null;
	private String productNames = null;
	private String mambuLoanEncodedKey = null;
	// -- Newly Added for Risk /mambu task creation
	private String riskWorkflowId;
	private Date riskAnaylysisCreatedAt;
	private String riskSummary;
	private String riskNotes;
	private String isHighValue;
	private String isEKYCDone;
	private String riskEvent;
	private String emiScheduleDateListStr;
	private BigDecimal balance;

	private String mandateRegistrationId;
	private String mandateRegistrationStatus;
	private String mandateSource;
	private String mandateComments;
	private Double mandateAmount;
	private Date mandateRegistrationDate;
	private String zestPerfiosScore;
	private Boolean loanWithdrawn;

	// Field which we need intermediately
	@JsonIgnore
	private long loanApplicationInternalId;

}
