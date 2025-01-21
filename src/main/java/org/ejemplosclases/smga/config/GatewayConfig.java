package org.ejemplosclases.smga.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("order_route", r -> r.path("/orders/**").uri("lb://order-service"))
                .route("dinosaur_route", r -> r.path("/dinosaur-data/**").uri("lb://dinosaur-service"))
                .build();
    }
}

