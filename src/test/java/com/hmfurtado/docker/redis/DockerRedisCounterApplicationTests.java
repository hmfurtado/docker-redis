package com.hmfurtado.docker.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(value = "classpath:test.properties")
class DockerRedisCounterApplicationTests {

	@Test
	void contextLoads() {
	}

}
