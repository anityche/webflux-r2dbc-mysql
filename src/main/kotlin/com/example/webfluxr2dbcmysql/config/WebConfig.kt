package com.example.webfluxr2dbcmysql.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.CacheControl
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.config.ResourceHandlerRegistry
import org.springframework.web.reactive.config.WebFluxConfigurer
import java.util.concurrent.TimeUnit

//@Configuration
//@EnableWebFlux
class WebConfig : WebFluxConfigurer {

//    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
//        registry.addResourceHandler("/resources/**")
//            .addResourceLocations("/public", "classpath:/static/")
//            .setCacheControl(CacheControl.maxAge(365, TimeUnit.DAYS))
//    }
}