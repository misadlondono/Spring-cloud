package com.serve.config_serve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@EnableConfigServer
@SpringBootApplication
public class ConfigServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServeApplication.class, args);
	}

}
