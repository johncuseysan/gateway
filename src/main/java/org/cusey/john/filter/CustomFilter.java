package org.cusey.john.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.core.ResolvableType;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpHeaders;

import org.springframework.stereotype.Component;
import org.springframework.util.StreamUtils;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequest.Builder;
import org.springframework.http.server.reactive.ServerHttpResponse;


@Component
public class CustomFilter extends AbstractGatewayFilterFactory<CustomFilter.Config> {
	
	private static final Logger log = LoggerFactory.getLogger(CustomFilter.class);
	
	public CustomFilter() {
		super(Config.class);
	}


	public static class Config {
		
		public String name;
		public boolean flag;
		
		public Config(String name, boolean flag) {
			super();
			this.name = name;
			this.flag = flag;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isFlag() {
			return flag;
		}

		public void setFlag(boolean flag) {
			this.flag = flag;
		}
	    
	}
	
	public void writeHeader(HttpHeaders header) {
		
	    for (Map.Entry<String, List<String>> entry : header.entrySet())
	    {
	    	 String key = entry.getKey();
	    	log.info("********KEY: "+ key);
	    	
	    	List<String> value = entry.getValue();  
	        for (int i = 0; i < value.size(); i++) {
	        	 
	            // Print all elements of List
	            System.out.println("VALUE: " + value.get(i));
	        }
	    	
	    }
	}

	@Override
	public GatewayFilter apply(Config config) {
		//Custom Pre Filter. Suppose we can extract JWT and perform Authentication
		return (exchange, chain) -> {
			
			log.info("*********PRE Filter **************");
			
			HttpHeaders headerRequest = exchange.getRequest().getHeaders();
			
			writeHeader( headerRequest );


			//Custom Post Filter.Suppose we can call error response handler based on error code.
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				

				log.info("*********POST Filter **************");

				HttpHeaders headerResponse = exchange.getResponse().getHeaders();
				
				writeHeader( headerResponse );				
				

			}));
		};
	}




}
