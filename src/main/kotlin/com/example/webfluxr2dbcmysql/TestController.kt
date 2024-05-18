package com.example.webfluxr2dbcmysql

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Flux

@Controller
class TestController {

    @Autowired
    lateinit var testService: TestService

    @GetMapping("/")
    fun index(): String = "index"

    @GetMapping("/test/{username}")
    @ResponseBody
    fun test(@PathVariable("username") username: String): Flux<Users> {
        println("::: test START username: $username")
        return testService.getUsers()

//        val user = Users(1, "name", "pass", false)
//        return user

//        return testService.findByUsername(username)
    }

}