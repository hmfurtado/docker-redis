package com.hmfurtado.docker.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class DockerRedisCounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerRedisCounterApplication.class, args);
	}

}
