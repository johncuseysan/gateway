package org.cusey.john.dto.mapper;

import org.cusey.john.dto.cornell.PurchaseCornell;
import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.cusey.john.dto.fortis.PurchaseFortis;
import org.cusey.john.dto.fortis.StoreResponseFortis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ResponseMapper {
	
	private static final Logger log = LoggerFactory.getLogger(ResponseMapper.class);
	
	public static StoreResponseFortis combine(StoreResponseFortis fortis, StoreResponseCornell cornell) {
		
		log.info("Combining Fortis College and Cornell College to create new Fortis Response Bodies");
		
		
		for(PurchaseCornell element : cornell.getProduct())
		{  
			PurchaseFortis addProduct = new PurchaseFortis();
			
			addProduct.setCost(element.getCost());
			
			fortis.getProduct().add(addProduct);
 
		}
		
		return fortis;
	
	}

}
