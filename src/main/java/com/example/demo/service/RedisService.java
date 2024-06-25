package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class RedisService {

//	@Autowired
//	private RedisTemplate<String, Object> redisTemplate;
	// RedisTemplate가 Redis에서 저장, 읽기
	
	public void save(String key, String value) {
//		redisTemplate.opsForValue().set(key, value); 
	}
	
	@Cacheable(value = "getRedis", key = "#p0")
	public String get(String key) {
		int a = 0; // 디버깅용 
		return "someData";
	}

	@Cacheable(value = "multiParam", key = "#p0 + '_' + #p1")
	public String get22(String key, String kk) {
		int a = 0; // 디버깅용 
		return "multiParam someData";
	}
}
