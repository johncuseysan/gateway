package org.cusey.john.config;

import org.cusey.john.cornell.dto.StoreResponse;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.factory.rewrite.RewriteFunction;
import org.springframework.web.server.ServerWebExchange;

import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class ResponseBodyRewrite implements RewriteFunction<String, String> {
	
	private static final Logger log = LoggerFactory.getLogger(ResponseBodyRewrite.class);

	private ObjectMapper objectMapper;
	
	@Autowired
	private StoreResponse storeResponse;
	
	
	public ResponseBodyRewrite(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@Override
	public Publisher<String> apply(ServerWebExchange exchange, String body) {
		
		log.info(body);
		
        try {
        	storeResponse = objectMapper.readValue(body, StoreResponse.class);


            return Mono.just(objectMapper.writeValueAsString(storeResponse));
        } catch (Exception ex) {
            log.info("Response JSON process fail", ex);
            return Mono.error(new Exception("Response JSON process fail", ex));
        }

	}

}
