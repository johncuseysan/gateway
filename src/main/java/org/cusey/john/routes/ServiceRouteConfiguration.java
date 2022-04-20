package org.cusey.john.routes;

import org.cusey.john.config.cornell.CornellRequestBodyRewrite;
import org.cusey.john.config.cornell.CornellResponseBodyRewrite;
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
		
		RouteLocator route = null;

		
		//http://localhost:8082/cornell/api/student/search -> http://localhost:8083/cornell/api/student/search
		route = builder.routes()
							.route(r -> r.path("/cornell/api/student/search")
									.filters( f->f
													.filter(custom.apply(new Config("John", true)) )
													.modifyRequestBody(String.class,String.class,new CornellRequestBodyRewrite(objectMapper))
													.modifyResponseBody(String.class, String.class, new CornellResponseBodyRewrite(objectMapper))
											)
										.uri("http://localhost:8083/"))
					.build();
		
		

		
		
		return route;
      }

}
