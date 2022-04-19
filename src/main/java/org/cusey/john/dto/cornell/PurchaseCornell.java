package org.cusey.john.dto.cornell;

public class PurchaseCornell {
	
	public Double cost;    						//9 Length 15 Allowed values: 0-9, Format "############.##"
	public String period;						//8 YYYYMM
	public String transactionDate;				//10 YYYYMMDD
	public String startDate;					//14 YYYYMMDD

	public String productCode;					//7 Length 5 Allowed values: 0-9, A-Z,
	public String studentId;				    //1  Format UUID

	public CreditCardCornell creditCardType;		    //11 Length  ENUM
	public String forwardTo;				    //13 Length 3 Min and max length are 3.
	public String holdDate;						//12 YYYYMMDD

	public String collegeName;				    //2 Length 15 Allowed values: 0-9, A-Z,
	public String collegeCatolog;				//4 Length 9  Allowed values: 0-9, A-Z,
	public String collegeType;					//6 Length 1  Private=P, Community=C
	
	public String method;						//3 
	public Boolean isAction;					//15
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public CreditCardCornell getCreditCardType() {
		return creditCardType;
	}
	public void setCreditCardType(CreditCardCornell creditCardType) {
		this.creditCardType = creditCardType;
	}
	public String getForwardTo() {
		return forwardTo;
	}
	public void setForwardTo(String forwardTo) {
		this.forwardTo = forwardTo;
	}
	public String getHoldDate() {
		return holdDate;
	}
	public void setHoldDate(String holdDate) {
		this.holdDate = holdDate;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeCatolog() {
		return collegeCatolog;
	}
	public void setCollegeCatolog(String collegeCatolog) {
		this.collegeCatolog = collegeCatolog;
	}
	public String getCollegeType() {
		return collegeType;
	}
	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Boolean getIsAction() {
		return isAction;
	}
	public void setIsAction(Boolean isAction) {
		this.isAction = isAction;
	}
	@Override
	public String toString() {
		return "Purchase [cost=" + cost + ", period=" + period + ", transactionDate=" + transactionDate + ", startDate="
				+ startDate + ", productCode=" + productCode + ", studentId=" + studentId + ", creditCardType="
				+ creditCardType + ", forwardTo=" + forwardTo + ", holdDate=" + holdDate + ", collegeName="
				+ collegeName + ", collegeCatolog=" + collegeCatolog + ", collegeType=" + collegeType + ", method="
				+ method + ", isAction=" + isAction + "]";
	}
	
	
	
	

}
