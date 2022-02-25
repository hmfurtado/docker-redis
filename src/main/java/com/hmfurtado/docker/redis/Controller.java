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
        Jedis jedis = new Jedis("redis://172.17.0.1:6379");
        return ResponseEntity.ok().body(jedis.incr("visitors"));
    }

    @GetMapping("/reset")
    public ResponseEntity<String> visitorCounterReset() {
        Jedis jedis = new Jedis("redis://172.17.0.1:6379");
        jedis.set("visitors", "0");
        return ResponseEntity.ok().body("reseted");
    }

}
