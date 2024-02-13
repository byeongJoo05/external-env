package com.example.externalenv;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class EnvironmentCheck {
	public final Environment env;

	public EnvironmentCheck(Environment env) {
		this.env = env;
	}

	@PostConstruct
	public void init(){

		String customValue = env.getProperty("custom.value");

		log.info("customValue = {}", customValue);

	}
}
