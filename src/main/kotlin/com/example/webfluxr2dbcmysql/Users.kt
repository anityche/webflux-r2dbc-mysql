package com.example.webfluxr2dbcmysql

import org.springframework.data.annotation.Id

data class Users(
    @Id var id: Int,
    var username: String,
    var password: String,
    var enabled: Boolean=false
)