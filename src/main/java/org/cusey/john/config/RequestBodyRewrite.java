package org.cusey.john.config;

import org.cusey.john.dto.Header;
import org.cusey.john.dto.cornell.CustomerRequestCornell;
import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.cusey.john.dto.fortis.CustomerRequestFortis;
import org.cusey.john.dto.mapper.RequestMapper;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.factory.rewrite.RewriteFunction;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ServerWebExchange;

import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class RequestBodyRewrite implements RewriteFunction<String, String> {
	
	private static final Logger log = LoggerFactory.getLogger(RequestBodyRewrite.class);
	
	private ObjectMapper objectMapper;
	
	private CustomerRequestFortis customerRequestFortis = new CustomerRequestFortis();
	private CustomerRequestCornell customerRequestCornell= new CustomerRequestCornell();
	private StoreResponseCornell storeResponseCornell = new StoreResponseCornell();
	
	private Header header = new Header();
    
	private WebClient.Builder webClient = WebClient.builder();
	
    public RequestBodyRewrite(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
      



	@Override
	public Publisher<String> apply(ServerWebExchange exchange, String body) {
		log.info(body);
		
		HttpHeaders headerRequest = exchange.getRequest().getHeaders();
		
		this.header.assignHeader(headerRequest);
		
        try {

        	this.customerRequestFortis = objectMapper.readValue(body, CustomerRequestFortis.class);
        	
        	this.customerRequestCornell = RequestMapper.fortisToCornell(customerRequestFortis);

        	
        	this.storeResponseCornell = webClient.build()
                    						.post()
                                            .uri("http://localhost:8083/cornell/api/student/search")
                                            .header("DATA", header.getData())
                                            .body(Mono.just(customerRequestCornell), CustomerRequestCornell.class)
                                            .retrieve()
                                            .bodyToMono(StoreResponseCornell.class)
                                            .block();
                                            
        	exchange.getAttributes().put("storeResponseCornell", this.storeResponseCornell);
        	

            return Mono.just(objectMapper.writeValueAsString(this.customerRequestFortis));
        } catch (Exception ex) {
            log.info("Request JSON process fail", ex);
            return Mono.error(new Exception("Request JSON process fail", ex));
        }
	}

}
