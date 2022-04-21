package org.cusey.john.config;

import java.util.List;
import java.util.Map;

import org.cusey.john.dto.cornell.CustomerRequestCornell;
import org.cusey.john.dto.cornell.HeaderCornell;
import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.cusey.john.dto.fortis.CustomerRequestFortis;
import org.cusey.john.dto.mapper.RequestMapper;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.factory.rewrite.RewriteFunction;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ServerWebExchange;

import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class RequestBodyRewrite implements RewriteFunction<String, String> {
	
	private static final Logger log = LoggerFactory.getLogger(RequestBodyRewrite.class);
	
	private ObjectMapper objectMapper;
	
	@Autowired
	private CustomerRequestFortis customerRequestFortis;
	
	@Autowired
	private CustomerRequestCornell customerRequestCornell;
	
	@Autowired
	private StoreResponseCornell storeResponseCornell;
	
	private HeaderCornell headerCornell;
	
	@Autowired 
	private WebClient.Builder webClient;
	
    public RequestBodyRewrite(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        
        customerRequestFortis = new CustomerRequestFortis();
        customerRequestCornell = new CustomerRequestCornell();
        
        storeResponseCornell = new StoreResponseCornell();
        headerCornell = new HeaderCornell();
        
        webClient = WebClient.builder();
    }
      
	public StoreResponseCornell getStoreResponseCornell() {return storeResponseCornell;}
	public void setStoreResponseCornell(StoreResponseCornell storeResponseCornell) {this.storeResponseCornell = storeResponseCornell;}
	
	public void writeHeader(HttpHeaders header) {
		
	    for (Map.Entry<String, List<String>> entry : header.entrySet())
	    {
	    	 String key = entry.getKey();
	    	log.info("********KEY: "+ key);
	    	
	    	List<String> value = entry.getValue();  
	    	
	    	if(key.equals("data")) {
	    		headerCornell.setData(value.get(0));
	    	}
	    	
	        for (int i = 0; i < value.size(); i++) {
	        	 
	            // Print all elements of List
	            System.out.println("VALUE: " + value.get(i));
	        }
	    	
	    }
	}

	@Override
	public Publisher<String> apply(ServerWebExchange exchange, String body) {
		log.info(body);
		
		HttpHeaders headerRequest = exchange.getRequest().getHeaders();
		
		writeHeader( headerRequest );
		
        try {

        	customerRequestFortis = objectMapper.readValue(body, CustomerRequestFortis.class);
        	
        	customerRequestCornell = RequestMapper.fortisToCornell(customerRequestFortis);

        	
        	storeResponseCornell = webClient.build()
                    						.post()
                                            .uri("http://localhost:8083/cornell/api/student/search")
                                            .header("DATA", headerCornell.getData())
                                            .body(Mono.just(customerRequestCornell), CustomerRequestCornell.class)
                                            .retrieve()
                                            .bodyToMono(StoreResponseCornell.class)
                                            .block();
                                            
        	exchange.getAttributes().put("storeResponseCornell", storeResponseCornell);
        	

            return Mono.just(objectMapper.writeValueAsString(customerRequestFortis));
        } catch (Exception ex) {
            log.info("Request JSON process fail", ex);
            return Mono.error(new Exception("Request JSON process fail", ex));
        }
	}

}
