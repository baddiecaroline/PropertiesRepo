package com.example.unit3templateconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Unit3templateconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Unit3templateconfigserverApplication.class, args);
	}

}
