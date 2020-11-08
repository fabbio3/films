package it.fbb.film

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFilmsApplication

fun main(args: Array<String>) {
	runApplication<MyFilmsApplication>(*args)
}
