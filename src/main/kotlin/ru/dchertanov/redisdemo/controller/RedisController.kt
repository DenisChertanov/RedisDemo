package ru.dchertanov.redisdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.dchertanov.redisdemo.service.RedisService

@RestController
class RedisController(
    private val redisService: RedisService,
) {

    @GetMapping("/get-key-value")
    fun getKeyValue(@RequestParam key: String): String? {
        return redisService.getKeyValue(key)
    }

    @PatchMapping("/set-key-value")
    fun setKeyValue(@RequestParam key: String, @RequestParam value: String) {
        redisService.setKeyValue(key, value)
    }
}