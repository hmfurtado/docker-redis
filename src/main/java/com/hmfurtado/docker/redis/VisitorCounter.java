package com.hmfurtado.docker.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
@RequestMapping("/")
@PropertySource("classpath:application.properties")
public class VisitorCounter {

    @Value("${redis.url}")
    String url;

    Integer port = 6379;

    @GetMapping
    public ResponseEntity<Long> visitorCounter() {
        Jedis jedis = new Jedis(url, port);
        return ResponseEntity.ok().body(jedis.incr("visitors"));
    }

    @GetMapping("/reset")
    public ResponseEntity<String> visitorCounterReset() {
        Jedis jedis = new Jedis(url, port);
        jedis.set("visitors", "0");
        return ResponseEntity.ok().body("reseted");
    }

}
