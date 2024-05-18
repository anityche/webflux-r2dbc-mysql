package com.example.webfluxr2dbcmysql

import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

// TEST R2dbcRepository
interface UsersRepository: R2dbcRepository<Users, Int> {
}

//// TEST ReactiveCrudRepository
//interface UsersRepository: ReactiveCrudRepository<Users, Int> {
//    @Query("select * from users where username=:username")
//    fun findByUsername(username: String): Flux<Users>
//}