package org.cusey.john.dto.cornell;

public class CustomerRequestCornell {
	
	public String searchStartDate; 				//5 MMDDYYYY
	public String searchEndDate; 				//6 MMDDYYYY
	public String courseNumber; 				//4 Allow Values 0-9 (Minimun  and Maximum Length = 5) 
	public String courseCode;       			//7 Allow Values 0-9, A-Z, a-z (Minimun  and Maximum Length = 6) 
	public String studentId;        			//3 Format UUID
	public GradeCornell passCourse;					//8 (PASS, FAIL)
	

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
