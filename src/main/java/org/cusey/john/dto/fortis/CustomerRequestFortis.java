package org.cusey.john.dto.fortis;

import org.cusey.john.dto.Grade;

public class CustomerRequestFortis {
	
	public String departmentName; 				
	public String searchStartDate; 				
	public String searchEndDate; 				
	public String courseNumber; 				
	public String courseCode;       			
	public String studentId;        			
	public String transactionId;				
	public Grade passCourse;					
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getSearchStartDate() {
		return searchStartDate;
	}
	public void setSearchStartDate(String searchStartDate) {
		this.searchStartDate = searchStartDate;
	}
	public String getSearchEndDate() {
		return searchEndDate;
	}
	public void setSearchEndDate(String searchEndDate) {
		this.searchEndDate = searchEndDate;
	}
	public String getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public Grade getPassCourse() {
		return passCourse;
	}
	public void setPassCourse(Grade passCourse) {
		this.passCourse = passCourse;
	}
	@Override
	public String toString() {
		return "CustomerRequestFortis [departmentName=" + departmentName + ", searchStartDate=" + searchStartDate
				+ ", searchEndDate=" + searchEndDate + ", courseNumber=" + courseNumber + ", courseCode=" + courseCode
				+ ", studentId=" + studentId + ", transactionId=" + transactionId + ", passCourse=" + passCourse + "]";
	}


}
