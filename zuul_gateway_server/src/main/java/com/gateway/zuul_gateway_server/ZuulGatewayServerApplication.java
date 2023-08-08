package com.gateway.zuul_gateway_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulGatewayServerApplication.class, args);
	}
	//@Bean
	//public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
			//	return builder.routes()
			//	.route("http://localhost:8090", r -> r.path("/migestor")
			//			.uri("http://localhost:8091/"))
	//	.build();
	//}

}
