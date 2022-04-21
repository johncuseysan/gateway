package org.cusey.john.routes;

import org.cusey.john.config.RequestBodyRewrite;
import org.cusey.john.config.ResponseBodyRewrite;
import org.cusey.john.filter.CustomFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.cusey.john.filter.CustomFilter.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class ServiceRouteConfiguration {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceRouteConfiguration.class);

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder, CustomFilter custom, ObjectMapper objectMapper) {
		
		
		log.info("**** START ROUTING *****");
		
		RouteLocator route = null;
		
		//http://localhost:8082/fortis/api/student/search -> http://localhost:8081/fortis/api/student/search
		route = builder.routes()
							.route(r -> r.path("/fortis/api/student/search")
									.filters( f->f
													.filter(custom.apply(new Config("Fortis College")) )
													.modifyRequestBody(String.class,String.class,new RequestBodyRewrite(objectMapper))
													.modifyResponseBody(String.class, String.class, new ResponseBodyRewrite(objectMapper))
											)
										.uri("http://localhost:8081/"))
					.build();
		
		
		return route;
      }

}
