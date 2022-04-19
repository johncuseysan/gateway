package org.cusey.john.dto.fortis;

import java.util.ArrayList;
import java.util.List;

public class StoreResponseFortis {
	
	public String staus;								    		//1
	public String details;		    								//2
	public int count;												//3
	public String studentId;										//4 Format UUID
	public List<ProductCategoryFortis> code = new ArrayList<>(); 			//5
	public List<PurchaseFortis> product = new ArrayList<>(); 						//6
	
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public List<ProductCategoryFortis> getCode() {
		return code;
	}
	public void setCode(List<ProductCategoryFortis> code) {
		this.code = code;
	}
	public List<PurchaseFortis> getProduct() {
		return product;
	}
	public void setProduct(List<PurchaseFortis> product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "StoreResponse [staus=" + staus + ", details=" + details + ", count=" + count + ", studentId="
				+ studentId + ", code=" + code + "]";
	}
	

	

	
	
	
	

}
