package org.cusey.john.cornell.dto;

import java.util.List;

public class StoreResponse {
	
	public  Transaction stage; 	
	
	public List<Purchase> product = null;
	
	public Transaction getStage() {
		return stage;
	}
	public void setStage(Transaction stage) {
		this.stage = stage;
	}
	public List<Purchase> getProduct() {
		return product;
	}
	public void setProduct(List<Purchase> product) {
		this.product = product;
	}

	
}
