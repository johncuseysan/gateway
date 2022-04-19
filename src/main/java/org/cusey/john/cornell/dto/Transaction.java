package org.cusey.john.cornell.dto;

import java.util.List;

public class Transaction {
	
	public List<BackErrors> back;
	public String studentId;
	public String staus;
	public String details;

	public List<BackErrors> getBack() {
		return back;
	}

	public void setBack(List<BackErrors> back) {
		this.back = back;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStaus() {
		return staus;
	}

	public void setStaus(String staus) {
		this.staus = staus;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Transaction [studentId=" + studentId + ", staus=" + staus + ", details=" + details + "]";
	}



	
	
	


}
