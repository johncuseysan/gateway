package org.cusey.john.dto.cornell;

import java.util.ArrayList;
import java.util.List;

public class StoreResponseCornell {
	
	public  TransactionCornell stage = new TransactionCornell(); 	
	
	public List<PurchaseCornell> product = new ArrayList<PurchaseCornell>();  
	
	public TransactionCornell getStage() {
		return stage;
	}
	public void setStage(TransactionCornell stage) {
		this.stage = stage;
	}
	public List<PurchaseCornell> getProduct() {
		return product;
	}
	public void setProduct(List<PurchaseCornell> product) {
		this.product = product;
	}

	
}
