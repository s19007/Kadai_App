package com.example.KadaiApp

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
@RequestMapping("/from")
class KadaiApp {
    @GetMapping("")
    fun kadai() : kotlin.String {
        return "form/kadai"
    }
}

@PostMapping("")
fun kadai(modelMap: ModelMap, @RequestParam kadai :kotlin.String) {
    val kadai = readLine()!!.toString()
    val b = "b"
    val a = "a"
    val c = "c"
    val ancer = when (kadai) {
        a -> "正解"
        b -> "不正解"
        c -> "不正解"
        else -> "not found"
    }
    println(ancer)
}

