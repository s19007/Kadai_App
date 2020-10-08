package com.example.KadaiApp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class kotlinAppApplication

fun main(args: Array<String>) {
    runApplication<kotlinAppApplication>(*args)
}
