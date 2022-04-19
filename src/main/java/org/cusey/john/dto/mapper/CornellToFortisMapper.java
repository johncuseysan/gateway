package org.cusey.john.dto.mapper;

import java.util.List;

import org.cusey.john.dto.cornell.PurchaseCornell;
import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CornellToFortisMapper {
	
	private static final Logger log = LoggerFactory.getLogger(CornellToFortisMapper.class);
	

	public StoreResponseCornell transform (StoreResponseCornell originalResponse) {
		
		StoreResponseCornell newResponse = new  StoreResponseCornell();
		
		List<PurchaseCornell> originalProductList = originalResponse.getProduct();
		List<PurchaseCornell> newProductList = newResponse.getProduct();
		
		log.info("Original Product List Length"+ originalProductList.size());
		log.info("New Product List Length"+ newProductList.size());
		
		
        for (PurchaseCornell original : originalProductList) {
        	
        	PurchaseCornell product = new PurchaseCornell();
        	
        	product.setCost(original.getCost() + 200);
        	
        	newProductList.add(product);
        }
        
        newResponse.setProduct(newProductList);

		return newResponse;
	}
	
	


}
;