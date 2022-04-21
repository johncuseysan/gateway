package org.cusey.john.filter;

import org.cusey.john.dto.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

import org.springframework.http.HttpHeaders;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class CustomFilter extends AbstractGatewayFilterFactory<CustomFilter.Config> {
	
	private static final Logger log = LoggerFactory.getLogger(CustomFilter.class);
	
	private Header header = new Header();
	
	public CustomFilter() {
		super(Config.class);
	}


	public static class Config {
		
		public String name;
		
		public Config(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	}
	

	@Override
	public GatewayFilter apply(Config config) {
		//Custom Pre Filter. Suppose we can extract JWT and perform Authentication
		return (exchange, chain) -> {
			
			log.info(config.getName());
			
			log.info("*********PRE Filter **************");
			
			HttpHeaders headerRequest = exchange.getRequest().getHeaders();
			
			header.assignHeader(headerRequest);
			
			//Custom Post Filter.Suppose we can call error response handler based on error code.
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				
				log.info(config.getName());

				log.info("*********POST Filter **************");

				HttpHeaders headerResponse = exchange.getResponse().getHeaders();
				
				header.assignHeader(headerResponse);		
				

			}));
		};
	}




}
