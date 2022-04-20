package org.cusey.john.config;

import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.cusey.john.dto.fortis.CustomerRequestFortis;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.factory.rewrite.RewriteFunction;
import org.springframework.web.server.ServerWebExchange;

import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class RequestBodyRewrite implements RewriteFunction<String, String> {
	
	private static final Logger log = LoggerFactory.getLogger(RequestBodyRewrite.class);
	
	private ObjectMapper objectMapper;
	
	@Autowired
	private CustomerRequestFortis customerRequestFortis;
	
	@Autowired
	private StoreResponseCornell storeResponseCornell;
	
    public RequestBodyRewrite(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        
        storeResponseCornell = new StoreResponseCornell();
    }
    
    

	public StoreResponseCornell getStoreResponseCornell() {
		return storeResponseCornell;
	}



	public void setStoreResponseCornell(StoreResponseCornell storeResponseCornell) {
		this.storeResponseCornell = storeResponseCornell;
	}



	@Override
	public Publisher<String> apply(ServerWebExchange exchange, String body) {
		log.info(body);
		
        try {

        	customerRequestFortis = objectMapper.readValue(body, CustomerRequestFortis.class);

            return Mono.just(objectMapper.writeValueAsString(customerRequestFortis));
        } catch (Exception ex) {
            log.info("Request JSON process fail", ex);
            return Mono.error(new Exception("Request JSON process fail", ex));
        }
	}

}
