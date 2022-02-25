package com.hmfurtado.docker.redis;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    public ResponseEntity<Long> visitorCounter() {
        Jedis jedis = new Jedis("redis://localhost:6379");
        jedis.set("visitors", "0");
        return ResponseEntity.ok().body(jedis.incr("visitors"));
    }
}
