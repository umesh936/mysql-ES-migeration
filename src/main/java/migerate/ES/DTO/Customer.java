package migerate.ES.DTO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Customer {
	private String customerId;
	private String mambuCustomerId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String gender;
	private String email;
	private BigInteger birthDate;
	private String phone;
	private String mobile;
	private String pan;
	private BigDecimal maxBasketSize;
	private String nachVerficationStatus;
	private String nachRegisterationId;
	private String nachRejectReason;
	private String permanentAddress;
	private String city;
	private String addressLine1;
	private String addressLine2;
	private String liveWith;
	private String pincode;
	private String preferedLanguage;
	private String OTPVerified;
	private String aadhar;
	private String panFirstName;
	private String panLastName;
	private String panStatus;
	private String panRuleStatus;
	private String employmentStatus;
	private String currentEmployer;
	private BigDecimal monthlyIncome;
	private BigDecimal monthlySpending;
	private BigDecimal monthlyEMIPayout;
	private String monthlyIncomeSupport;
	private String cibilScore;
	private String bankName;
	private String mambuCustomerEncodedKey;
	private String cibilRequest;
	private String tuefResponse;
	private String aadhaarReferenceCode;

	private String ekycVerfiedAadhaar;
	private String ekycVerfiedName;
	private Date ekycVerfiedDob;
	private String ekycVerfiedGender;
	private String ekycVerfiedAddressCareOf;
	private String ekycVerfiedAddressHouse;
	private String ekycVerfiedAddressStreet;
	private String ekycVerfiedAddressCity;
	private String ekycVerfiedAddressSubDistrict;
	private String ekycVerfiedAddressDistrict;
	private String ekycVerfiedAddressState;
	private String ekycVerfiedAddressPostOffice;
	private String ekycVerfiedAddressPincode;
	private String ekycVerfiedEmail;
	private String ekycVerfiedPhoneNumber;
	private String zestScoreL0;
	private boolean perfiosReportParsed;
	private Boolean perfiosTransactionCompleted;
	private Boolean mobilePhoneVerified;
	private Date creditLimitCreatedAt;
	private Date creditLimitExpiryDate;
	private String creditLimitStatus;
	private Double approvedCreditLimit;
	private Double availableCreditLimit;

	public String getMambuCustomerEncodedKey() {
		return mambuCustomerEncodedKey;
	}

	public void setMambuCustomerEncodedKey(String mambuCustomerEncodedKey) {
		this.mambuCustomerEncodedKey = mambuCustomerEncodedKey;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(BigInteger birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public BigDecimal getMaxBasketSize() {
		return maxBasketSize;
	}

	public void setMaxBasketSize(BigDecimal maxBasketSize) {
		this.maxBasketSize = maxBasketSize;
	}

	public String getNachVerficationStatus() {
		return nachVerficationStatus;
	}

	public void setNachVerficationStatus(String nachVerficationStatus) {
		this.nachVerficationStatus = nachVerficationStatus;
	}

	public String getNachRegisterationId() {
		return nachRegisterationId;
	}

	public void setNachRegisterationId(String nachRegisterationId) {
		this.nachRegisterationId = nachRegisterationId;
	}

	public String getNachRejectReason() {
		return nachRejectReason;
	}

	public void setNachRejectReason(String nachRejectReason) {
		this.nachRejectReason = nachRejectReason;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getLiveWith() {
		return liveWith;
	}

	public void setLiveWith(String liveWith) {
		this.liveWith = liveWith;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPreferedLanguage() {
		return preferedLanguage;
	}

	public void setPreferedLanguage(String preferedLanguage) {
		this.preferedLanguage = preferedLanguage;
	}

	public String getOTPVerified() {
		return OTPVerified;
	}

	public void setOTPVerified(String oTPVerified) {
		OTPVerified = oTPVerified;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getPanFirstName() {
		return panFirstName;
	}

	public void setPanFirstName(String panFirstName) {
		this.panFirstName = panFirstName;
	}

	public String getPanLastName() {
		return panLastName;
	}

	public void setPanLastName(String panLastName) {
		this.panLastName = panLastName;
	}

	public String getPanStatus() {
		return panStatus;
	}

	public void setPanStatus(String panStatus) {
		this.panStatus = panStatus;
	}

	public String getPanRuleStatus() {
		return panRuleStatus;
	}

	public void setPanRuleStatus(String panRuleStatus) {
		this.panRuleStatus = panRuleStatus;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public String getCurrentEmployer() {
		return currentEmployer;
	}

	public void setCurrentEmployer(String currentEmployer) {
		this.currentEmployer = currentEmployer;
	}

	public BigDecimal getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(BigDecimal monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public BigDecimal getMonthlySpending() {
		return monthlySpending;
	}

	public void setMonthlySpending(BigDecimal monthlySpending) {
		this.monthlySpending = monthlySpending;
	}

	public BigDecimal getMonthlyEMIPayout() {
		return monthlyEMIPayout;
	}

	public void setMonthlyEMIPayout(BigDecimal monthlyEMIPayout) {
		this.monthlyEMIPayout = monthlyEMIPayout;
	}

	public String getMonthlyIncomeSupport() {
		return monthlyIncomeSupport;
	}

	public void setMonthlyIncomeSupport(String monthlyIncomeSupport) {
		this.monthlyIncomeSupport = monthlyIncomeSupport;
	}

	public String getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getMambuCustomerId() {
		return mambuCustomerId;
	}

	public void setMambuCustomerId(String mambuCustomerId) {
		this.mambuCustomerId = mambuCustomerId;
	}

	public String getCibilRequest() {
		return cibilRequest;
	}

	public void setCibilRequest(String cibilRequest) {
		this.cibilRequest = cibilRequest;
	}

	public String getTuefResponse() {
		return tuefResponse;
	}

	public void setTuefResponse(String tuefResponse) {
		this.tuefResponse = tuefResponse;
	}

	public String getAadhaarReferenceCode() {
		return aadhaarReferenceCode;
	}

	public void setAadhaarReferenceCode(String aadhaarReferenceCode) {
		this.aadhaarReferenceCode = aadhaarReferenceCode;
	}

	public String getEkycVerfiedAadhaar() {
		return ekycVerfiedAadhaar;
	}

	public void setEkycVerfiedAadhaar(String ekycVerfiedAadhaar) {
		this.ekycVerfiedAadhaar = ekycVerfiedAadhaar;
	}

	public String getEkycVerfiedName() {
		return ekycVerfiedName;
	}

	public void setEkycVerfiedName(String ekycVerfiedName) {
		this.ekycVerfiedName = ekycVerfiedName;
	}

	public Date getEkycVerfiedDob() {
		return ekycVerfiedDob;
	}

	public void setEkycVerfiedDob(Date ekycVerfiedDob) {
		this.ekycVerfiedDob = ekycVerfiedDob;
	}

	public String getEkycVerfiedGender() {
		return ekycVerfiedGender;
	}

	public void setEkycVerfiedGender(String ekycVerfiedGender) {
		this.ekycVerfiedGender = ekycVerfiedGender;
	}

	public String getEkycVerfiedAddressCareOf() {
		return ekycVerfiedAddressCareOf;
	}

	public void setEkycVerfiedAddressCareOf(String ekycVerfiedAddressCareOf) {
		this.ekycVerfiedAddressCareOf = ekycVerfiedAddressCareOf;
	}

	public String getEkycVerfiedAddressHouse() {
		return ekycVerfiedAddressHouse;
	}

	public void setEkycVerfiedAddressHouse(String ekycVerfiedAddressHouse) {
		this.ekycVerfiedAddressHouse = ekycVerfiedAddressHouse;
	}

	public String getEkycVerfiedAddressStreet() {
		return ekycVerfiedAddressStreet;
	}

	public void setEkycVerfiedAddressStreet(String ekycVerfiedAddressStreet) {
		this.ekycVerfiedAddressStreet = ekycVerfiedAddressStreet;
	}

	public String getEkycVerfiedAddressCity() {
		return ekycVerfiedAddressCity;
	}

	public void setEkycVerfiedAddressCity(String ekycVerfiedAddressCity) {
		this.ekycVerfiedAddressCity = ekycVerfiedAddressCity;
	}

	public String getEkycVerfiedAddressSubDistrict() {
		return ekycVerfiedAddressSubDistrict;
	}

	public void setEkycVerfiedAddressSubDistrict(String ekycVerfiedAddressSubDistrict) {
		this.ekycVerfiedAddressSubDistrict = ekycVerfiedAddressSubDistrict;
	}

	public String getEkycVerfiedAddressDistrict() {
		return ekycVerfiedAddressDistrict;
	}

	public void setEkycVerfiedAddressDistrict(String ekycVerfiedAddressDistrict) {
		this.ekycVerfiedAddressDistrict = ekycVerfiedAddressDistrict;
	}

	public String getEkycVerfiedAddressState() {
		return ekycVerfiedAddressState;
	}

	public void setEkycVerfiedAddressState(String ekycVerfiedAddressState) {
		this.ekycVerfiedAddressState = ekycVerfiedAddressState;
	}

	public String getEkycVerfiedAddressPostOffice() {
		return ekycVerfiedAddressPostOffice;
	}

	public void setEkycVerfiedAddressPostOffice(String ekycVerfiedAddressPostOffice) {
		this.ekycVerfiedAddressPostOffice = ekycVerfiedAddressPostOffice;
	}

	public String getEkycVerfiedAddressPincode() {
		return ekycVerfiedAddressPincode;
	}

	public void setEkycVerfiedAddressPincode(String ekycVerfiedAddressPincode) {
		this.ekycVerfiedAddressPincode = ekycVerfiedAddressPincode;
	}

	public String getEkycVerfiedEmail() {
		return ekycVerfiedEmail;
	}

	public void setEkycVerfiedEmail(String ekycVerfiedEmail) {
		this.ekycVerfiedEmail = ekycVerfiedEmail;
	}

	public String getEkycVerfiedPhoneNumber() {
		return ekycVerfiedPhoneNumber;
	}

	public void setEkycVerfiedPhoneNumber(String ekycVerfiedPhoneNumber) {
		this.ekycVerfiedPhoneNumber = ekycVerfiedPhoneNumber;
	}

	public String getZestScoreL0() {
		return zestScoreL0;
	}

	public void setZestScoreL0(String zestScoreL0) {
		this.zestScoreL0 = zestScoreL0;
	}

	public boolean isPerfiosReportParsed() {
		return perfiosReportParsed;
	}

	public void setPerfiosReportParsed(boolean perfiosReportParsed) {
		this.perfiosReportParsed = perfiosReportParsed;
	}

	public Boolean getPerfiosTransactionCompleted() {
		return perfiosTransactionCompleted;
	}

	public void setPerfiosTransactionCompleted(Boolean perfiosTransactionCompleted) {
		this.perfiosTransactionCompleted = perfiosTransactionCompleted;
	}

	public Boolean getMobilePhoneVerified() {
		return mobilePhoneVerified;
	}

	public void setMobilePhoneVerified(Boolean mobilePhoneVerified) {
		this.mobilePhoneVerified = mobilePhoneVerified;
	}

	public Date getCreditLimitCreatedAt() {
		return creditLimitCreatedAt;
	}

	public void setCreditLimitCreatedAt(Date creditLimitCreatedAt) {
		this.creditLimitCreatedAt = creditLimitCreatedAt;
	}

	public Date getCreditLimitExpiryDate() {
		return creditLimitExpiryDate;
	}

	public void setCreditLimitExpiryDate(Date creditLimitExpiryDate) {
		this.creditLimitExpiryDate = creditLimitExpiryDate;
	}

	public String getCreditLimitStatus() {
		return creditLimitStatus;
	}

	public void setCreditLimitStatus(String creditLimitStatus) {
		this.creditLimitStatus = creditLimitStatus;
	}

	public Double getApprovedCreditLimit() {
		return approvedCreditLimit;
	}

	public void setApprovedCreditLimit(Double approvedCreditLimit) {
		this.approvedCreditLimit = approvedCreditLimit;
	}

	public Double getAvailableCreditLimit() {
		return availableCreditLimit;
	}

	public void setAvailableCreditLimit(Double availableCreditLimit) {
		this.availableCreditLimit = availableCreditLimit;
	}
}
