package org.cusey.john.dto.cornell;

import org.cusey.john.dto.Grade;

public class CustomerRequestCornell {
	
	public String searchStartDate; 				
	public String searchEndDate; 				
	public String courseNumber; 				 
	public String courseCode;       			 
	public String studentId;        			
	public Grade passCourse;					
	

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
	public Grade getPassCourse() {
		return passCourse;
	}
	public void setPassCourse(Grade passCourse) {
		this.passCourse = passCourse;
	}
	@Override
	public String toString() {
		return "CustomerRequestCornell [searchStartDate=" + searchStartDate + ", searchEndDate=" + searchEndDate
				+ ", courseNumber=" + courseNumber + ", courseCode=" + courseCode + ", studentId=" + studentId
				+ ", passCourse=" + passCourse + "]";
	}


}
