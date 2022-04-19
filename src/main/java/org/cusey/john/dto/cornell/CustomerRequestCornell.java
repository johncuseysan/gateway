package org.cusey.john.dto.cornell;

public class CustomerRequestCornell {
	
	public String searchStartDate; 				
	public String searchEndDate; 				
	public String courseNumber; 				 
	public String courseCode;       			 
	public String studentId;        			
	public GradeCornell passCourse;					
	

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
	public GradeCornell getPassCourse() {
		return passCourse;
	}
	public void setPassCourse(GradeCornell passCourse) {
		this.passCourse = passCourse;
	}
	
	@Override
	public String toString() {
		return "CustomerRequest [searchStartDate=" + searchStartDate + ", searchEndDate=" + searchEndDate
				+ ", courseNumber=" + courseNumber + ", courseCode=" + courseCode + ", studentId=" + studentId
				+ ", passCourse=" + passCourse + "]";
	}
	

	

	
	
	
}
