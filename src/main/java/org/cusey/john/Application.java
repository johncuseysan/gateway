/**
 * 
 */
package org.cusey.john;

import org.cusey.john.dto.cornell.CustomerRequestCornell;
import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication(scanBasePackages = "org.cusey.john.*")
public class Application {
	
	
	@Bean
	public WebClient.Builder getWebClientBuilder(){
		
		return WebClient.builder();
	}
	
	
	@Bean
	public CustomerRequestCornell getCustomerRequestCornell() {
		return new CustomerRequestCornell();
	}
	
	@Bean
	public StoreResponseCornell getStoreResponseCornell() {
		return new StoreResponseCornell();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}