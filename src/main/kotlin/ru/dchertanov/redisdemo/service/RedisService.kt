package ru.dchertanov.redisdemo.service

import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.stereotype.Service

@Service
class RedisService(
    private val stringRedisTemplate: StringRedisTemplate,
) {

    fun setKeyValue(key: String, value: String) {
        stringRedisTemplate.opsForValue()[key] = value
    }

    fun getKeyValue(key: String): String? {
        return stringRedisTemplate.opsForValue()[key]
    }
}