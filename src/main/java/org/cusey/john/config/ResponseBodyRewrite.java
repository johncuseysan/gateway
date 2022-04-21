package org.cusey.john.config;

import org.cusey.john.dto.cornell.StoreResponseCornell;
import org.cusey.john.dto.fortis.StoreResponseFortis;
import org.cusey.john.dto.mapper.ResponseMapper;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.factory.rewrite.RewriteFunction;
import org.springframework.web.server.ServerWebExchange;

import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class ResponseBodyRewrite implements RewriteFunction<String, String> {
	
	private static final Logger log = LoggerFactory.getLogger(ResponseBodyRewrite.class);

	private ObjectMapper objectMapper;
	
	private StoreResponseFortis storeResponseFortis = new StoreResponseFortis();
	private StoreResponseCornell storeResponseCornell = new StoreResponseCornell();
	
	public ResponseBodyRewrite(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@Override
	public Publisher<String> apply(ServerWebExchange exchange, String body) {
		
		log.info(body);
		
        try {
        	this.storeResponseFortis = objectMapper.readValue(body, StoreResponseFortis.class);
        	
        	this.storeResponseCornell = exchange.getAttribute("storeResponseCornell");
        	
        	this.storeResponseFortis = ResponseMapper.combine(this.storeResponseFortis, this.storeResponseCornell);

            return Mono.just(objectMapper.writeValueAsString( this.storeResponseFortis ));
        } catch (Exception ex) {
            log.info("Response JSON process fail", ex);
            return Mono.error(new Exception("Response JSON process fail", ex));
        }

	}

}
