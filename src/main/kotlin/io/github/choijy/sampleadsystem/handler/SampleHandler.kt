package io.github.choijy.sampleadsystem.handler

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class SampleHandler {

    fun index(req: ServerRequest): Mono<ServerResponse> =
        ServerResponse.ok().body(Mono.just("hello world"))
}