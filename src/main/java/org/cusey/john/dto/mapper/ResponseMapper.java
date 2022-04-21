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
			addProduct.setPeriod(element.getPeriod());
			addProduct.setTransactionDate(element.getTransactionDate());
			addProduct.setStartDate(element.getStartDate());
			addProduct.setProductType("T");
			addProduct.setProductNumber("da7ec4b1-a463-4921-8ee8-998ff2d3971c");				
			addProduct.setCatolog("CC");						
			addProduct.setProductCode(element.getProductCode());
			addProduct.setStudentId(element.getStudentId());					  
			addProduct.setCollegeId("");						
			addProduct.setCreditCardType(element.getCreditCardType());		    
			addProduct.setForwardTo(element.getForwardTo());					 
			addProduct.setHoldDate(element.getHoldDate());						
			addProduct.setReleaseDate("");				  
			addProduct.setCollegeName(element.getCollegeName());				  
			addProduct.setCollegeCatolog(element.getCollegeCatolog());			
			addProduct.setCollegeNumber("698084");					
			addProduct.setCollegeType(element.getCollegeType());		
			
			
			
			
			fortis.getProduct().add(addProduct);
			
			
 
		}
		
		return fortis;
	
	}

}
