package com.rabbitshop.springcloudclient.controllers;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/users")
public class UserController {

	private static final String USER_PASSWORD_PROPERTY = "user.password";
	
	@Value("${user.role}")
	@Getter
	private String role;

	@Resource(type = Environment.class)
	@Getter
	private Environment springEnvironment;
	
	@GetMapping(value = "/role", produces = MediaType.TEXT_PLAIN_VALUE)
	public String role() {
		
		log.info("Get role from Cloud Config...");

		return "Hello! Your role is " + getRole();
	}

	@GetMapping(value = "/password", produces = MediaType.TEXT_PLAIN_VALUE)
	public String password() {

		log.info("Get password from Cloud Config...");
		
		return "Hello! Your password is " + getPassword();
	}

	private String getPassword() {

		return getSpringEnvironment().getProperty(USER_PASSWORD_PROPERTY, String.class);
	}

}
