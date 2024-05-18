package com.example.webfluxr2dbcmysql

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class TestService {

    @Autowired
    lateinit var userRepository: UsersRepository

    // TEST R2dbcRepository
    fun getUsers(): Flux<Users> {
        return userRepository.findAll()
    }


//    // ReactiveCrudRepository
//    fun findByUsername(username: String): Flux<Users> {
//        return userRepository.findByUsername(username)
//    }
}