package org.cusey.john.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceRouteConfiguration {
	

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		
		RouteLocator route = null;
		
		
		//http://localhost:8082/employee/message
		route = builder.routes()
				.route(r -> r.path("/employee/message")
                        .uri("http://localhost:8084/"))
                .build();
		
		
		
		return route;
	}

}
