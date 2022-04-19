package org.cusey.john.config;

import java.util.Map;

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
	
	public ResponseBodyRewrite(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@Override
	public Publisher<String> apply(ServerWebExchange exchange, String body) {
		
		log.info(body);
		
        try {
            Map<String, Object> map = objectMapper.readValue(body, Map.class);


            return Mono.just(objectMapper.writeValueAsString(map));
        } catch (Exception ex) {
            log.info("JSON process fail", ex);
            return Mono.error(new Exception("JSON process fail", ex));
        }

	}

}
