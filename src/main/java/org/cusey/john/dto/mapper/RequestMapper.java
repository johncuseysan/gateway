package org.cusey.john.dto.mapper;

import org.cusey.john.dto.cornell.CustomerRequestCornell;
import org.cusey.john.dto.cornell.GradeCornell;
import org.cusey.john.dto.fortis.CustomerRequestFortis;
import org.cusey.john.dto.fortis.GradeFortis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class RequestMapper {
	
	private static final Logger log = LoggerFactory.getLogger(RequestMapper.class);
	

	public static CustomerRequestCornell fortisToCornell(CustomerRequestFortis fortis) {
		
		CustomerRequestCornell cornell = new CustomerRequestCornell();
		
	
		cornell.setSearchStartDate(fortis.getSearchStartDate());
		cornell.setSearchEndDate(fortis.getSearchStartDate());
		cornell.setCourseNumber(fortis.getCourseNumber());
		cornell.setCourseCode(fortis.getCourseCode());
		cornell.setStudentId(fortis.getStudentId());
		
		if(fortis.getPassCourse() == GradeFortis.PASS) {
			cornell.setPassCourse(GradeCornell.PASS);
		}
	
		if(fortis.getPassCourse() == GradeFortis.FAIL) {
			cornell.setPassCourse(GradeCornell.FAIL);
		}
		
		return cornell;
	}
	
	


}
;