package org.cusey.john.dto.mapper;

import org.cusey.john.dto.Grade;
import org.cusey.john.dto.cornell.CustomerRequestCornell;
import org.cusey.john.dto.fortis.CustomerRequestFortis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public final class RequestMapper {
	
	private static final Logger log = LoggerFactory.getLogger(RequestMapper.class);
	

	public static CustomerRequestCornell fortisToCornell(CustomerRequestFortis fortis) {
		
		log.info("Mapped Fortis College to Cornell College Request Body");
		
		CustomerRequestCornell cornell = new CustomerRequestCornell();
		
		cornell.setSearchStartDate(fortis.getSearchStartDate());
		cornell.setSearchEndDate(fortis.getSearchStartDate());
		cornell.setCourseNumber(fortis.getCourseNumber());
		cornell.setCourseCode(fortis.getCourseCode());
		cornell.setStudentId(fortis.getStudentId());
		
		if(fortis.getPassCourse() == Grade.PASS) {
			cornell.setPassCourse(Grade.PASS);
		}
		
		if(fortis.getPassCourse() == Grade.FAIL) {
			cornell.setPassCourse(Grade.FAIL);
		}


		return cornell;
	}
	
	


}
;