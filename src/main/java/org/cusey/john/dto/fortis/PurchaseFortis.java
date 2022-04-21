package org.cusey.john.dto.fortis;

import org.cusey.john.dto.CreditCard;

public class PurchaseFortis {
	
	public Double cost;    						
	public String period;						
	public String transactionDate;				
	public String startDate;					
	
	public String productType;					
	public String productNumber;				
	public String catolog;						
	
	public String productCode;					
	public String studentId;				    
	public String collegeId;					
	public CreditCard creditCardType;		    
	public String forwardTo;				    
	public String holdDate;						
	
	public String releaseDate;				    
	
	public String collegeName;				    
	public String collegeCatolog;				
	public String collegeNumber;				
	public String collegeType;					
	
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
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}
	public String getCatolog() {
		return catolog;
	}
	public void setCatolog(String catolog) {
		this.catolog = catolog;
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
	public String getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(String collegeId) {
		this.collegeId = collegeId;
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
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
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
	public String getCollegeNumber() {
		return collegeNumber;
	}
	public void setCollegeNumber(String collegeNumber) {
		this.collegeNumber = collegeNumber;
	}
	public String getCollegeType() {
		return collegeType;
	}
	public void setCollegeType(String collegeType) {
		this.collegeType = collegeType;
	}
	
	@Override
	public String toString() {
		return "Purchase [cost=" + cost + ", period=" + period + ", transactionDate=" + transactionDate + ", startDate="
				+ startDate + ", productType=" + productType + ", productNumber=" + productNumber + ", catolog="
				+ catolog + ", productCode=" + productCode + ", studentId=" + studentId + ", collegeId=" + collegeId
				+ ", creditCardType=" + creditCardType + ", forwardTo=" + forwardTo + ", holdDate=" + holdDate
				+ ", releaseDate=" + releaseDate + ", collegeName=" + collegeName + ", collegeCatolog=" + collegeCatolog
				+ ", collegeNumber=" + collegeNumber + ", collegeType=" + collegeType + "]";
	}
	

	
	
	
	
	

}
