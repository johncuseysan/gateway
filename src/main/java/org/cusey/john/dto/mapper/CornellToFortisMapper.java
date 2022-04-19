package org.cusey.john.dto.mapper;

import java.util.List;

import org.cusey.john.dto.cornell.PurchaseCornell;
import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.cusey.john.dto.fortis.StoreResponseFortis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CornellToFortisMapper {
	
	private static final Logger log = LoggerFactory.getLogger(CornellToFortisMapper.class);
	

	public StoreResponseFortis transform (StoreResponseCornell originalResponse) {
		
		StoreResponseFortis newResponse = new StoreResponseFortis();
		
		List<PurchaseCornell> originalProductList = originalResponse.getProduct();

		log.info("Original Product List Length"+ originalProductList.size());

		
		
        for (PurchaseCornell original : originalProductList) {
        	
        	PurchaseCornell product = new PurchaseCornell();
        	
        	product.setCost(original.getCost() + 200);
        	

        }
        
 

		return newResponse;
	}
	
	


}
;