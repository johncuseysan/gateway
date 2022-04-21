package org.cusey.john.dto.fortis;

import java.util.ArrayList;
import java.util.List;

import org.cusey.john.dto.ProductCategory;

public class StoreResponseFortis {
	
	public String staus;								    		
	public String details;		    								
	public int count;												
	public String studentId;										
	public List<ProductCategory> code = new ArrayList<>(); 			
	public List<PurchaseFortis> product = new ArrayList<>(); 						
	
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
	public List<ProductCategory> getCode() {
		return code;
	}
	public void setCode(List<ProductCategory> code) {
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
