package com.liempt.microservices.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LiemptSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiemptSpringCloudConfigServerApplication.class, args);
	}

}
