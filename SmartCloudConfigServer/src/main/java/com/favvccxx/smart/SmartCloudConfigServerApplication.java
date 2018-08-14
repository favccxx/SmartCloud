package com.favvccxx.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SmartCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartCloudConfigServerApplication.class, args);
	}
}
