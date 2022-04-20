package org.cusey.john.config.cornell;


import org.cusey.john.dto.cornell.CustomerRequestCornell;
import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.factory.rewrite.RewriteFunction;
import org.springframework.web.server.ServerWebExchange;

import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

public class CornellRequestBodyRewrite implements RewriteFunction<String, String> {
	
	private static final Logger log = LoggerFactory.getLogger(CornellRequestBodyRewrite.class);
	
	private ObjectMapper objectMapper;
	
	@Autowired
	private CustomerRequestCornell customerRequestCornell;
	
    public CornellRequestBodyRewrite(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

	@Override
	public Publisher<String> apply(ServerWebExchange exchange, String body) {
		log.info(body);
		
        try {

            customerRequestCornell = objectMapper.readValue(body, CustomerRequestCornell.class);

            return Mono.just(objectMapper.writeValueAsString(customerRequestCornell));
        } catch (Exception ex) {
            log.info("Request JSON process fail", ex);
            return Mono.error(new Exception("Request JSON process fail", ex));
        }
	}

}
