package org.cusey.john.dto.cornell;

import org.cusey.john.dto.CreditCard;

public class PurchaseCornell {
	
	public Double cost;    						
	public String period;						
	public String transactionDate;				
	public String startDate;					

	public String productCode;					
	public String studentId;				   

	public CreditCard creditCardType;		   
	public String forwardTo;				   
	public String holdDate;						

	public String collegeName;				 
	public String collegeCatolog;			
	public String collegeType;					
	
	public String method;						
	public Boolean isAction;				
	
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
	public CreditCard getCreditCardType() {
		return creditCardType;
	}
	public void setCreditCardType(CreditCard creditCardType) {
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
		return "PurchaseCornell [cost=" + cost + ", period=" + period + ", transactionDate=" + transactionDate
				+ ", startDate=" + startDate + ", productCode=" + productCode + ", studentId=" + studentId
				+ ", creditCardType=" + creditCardType + ", forwardTo=" + forwardTo + ", holdDate=" + holdDate
				+ ", collegeName=" + collegeName + ", collegeCatolog=" + collegeCatolog + ", collegeType=" + collegeType
				+ ", method=" + method + ", isAction=" + isAction + "]";
	}

	
}
