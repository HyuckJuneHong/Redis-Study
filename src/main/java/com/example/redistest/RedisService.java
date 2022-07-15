package com.example.redistest;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RedisService {

    private final StringRedisTemplate stringRedisTemplate;

    public StringRedisTemplate getStringRedisTemplate(String key) {

        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        System.out.println("Redis Key: " + key);
        System.out.println("Redis Value: " + stringStringValueOperations.get(key));
        return stringRedisTemplate;
    }
}
