package com.rabbitshop.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This will be a very simple client application, consisting of a REST controller with one GET method.
 *
 * The configuration, to fetch our server, must be placed in a resource file named "bootstrap.properties", because this file
 * (like the name implies) will be loaded very early while the application starts.
 */
@SpringBootApplication
public class SpringCloudClientApplication {
	
	public static void main(final String[] args) {
		
		SpringApplication.run(SpringCloudClientApplication.class, args);
	}
}
