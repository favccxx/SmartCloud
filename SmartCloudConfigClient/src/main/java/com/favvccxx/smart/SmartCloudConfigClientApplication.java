package com.favvccxx.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;


@SpringBootApplication
public class SmartCloudConfigClientApplication {
	
	@Autowired
	void setEnviroment(Environment env) {
		System.out.println("my-config.appName from env: " 
			+ env.getProperty("smart.from"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SmartCloudConfigClientApplication.class, args);
	}
}
