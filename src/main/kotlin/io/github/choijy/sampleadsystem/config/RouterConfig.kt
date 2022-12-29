package io.github.choijy.sampleadsystem.config

import io.github.choijy.sampleadsystem.handler.SampleHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class RouterConfig {

    @Bean
    fun routerExample(handler: SampleHandler): RouterFunction<ServerResponse> {
        return RouterFunctions.route()
            .GET("/v1/sample") { req -> handler.index(req) }
            .build()
    }
}