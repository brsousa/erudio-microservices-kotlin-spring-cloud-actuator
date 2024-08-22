package br.com.erudio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class ErudioConfigServerApplication

fun main(args: Array<String>) {
	runApplication<ErudioConfigServerApplication>(*args)
}
