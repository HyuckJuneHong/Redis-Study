package com.example.redistest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RedisController {

    private final RedisService redisService;

    @PostMapping("/testRedis")
    public void getRedisStringValue(String key){
        redisService.getStringRedisTemplate(key);
    }
}
