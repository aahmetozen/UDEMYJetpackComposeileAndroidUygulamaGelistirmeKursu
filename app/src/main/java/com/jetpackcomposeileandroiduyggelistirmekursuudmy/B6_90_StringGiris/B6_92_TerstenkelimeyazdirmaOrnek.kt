package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B6_90_StringGiris

import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)
    println("kelime giriniz:")
    val kelime=scanner.next()

    for (i in kelime.length-1 downTo 0){
        print(kelime[i])
    }
}