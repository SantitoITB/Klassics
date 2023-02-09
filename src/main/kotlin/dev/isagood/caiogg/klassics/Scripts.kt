package dev.isagood.caiogg.klassics

import io.ktor.resources.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.resources.*
import io.ktor.server.resources.get
import io.ktor.server.response.*
import io.ktor.server.routing.*

@Resource("/scripts/main.js")
class MainJs()

fun Route.scripts() {
    get<MainJs> {
        call.respond(call.resolveResource("scripts.js")!!)
    }
}
