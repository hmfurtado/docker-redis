package com.hmfurtado.docker.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerRedisCounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerRedisCounterApplication.class, args);
	}

}
