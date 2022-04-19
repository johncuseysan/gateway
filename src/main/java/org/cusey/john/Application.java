/**
 * 
 */
package org.cusey.john;

/**
 * @author john
 *
 */

import org.cusey.john.cornell.dto.CustomerRequest;
import org.cusey.john.cornell.dto.StoreResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages = "org.cusey.john.*")
public class Application {
	
	
	@Bean
	public CustomerRequest getCustomerRequest() {
		return new CustomerRequest();
	}
	
	@Bean
	public StoreResponse getStoreResponse() {
		return new StoreResponse();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}