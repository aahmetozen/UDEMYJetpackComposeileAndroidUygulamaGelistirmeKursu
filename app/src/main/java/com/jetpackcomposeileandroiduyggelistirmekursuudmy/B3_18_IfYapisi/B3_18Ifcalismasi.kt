package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_18_IfYapisi

fun main(){
    var a:Int=100

    if (a==20){
        println("a degeri,$a ya esittir")
    }else if (a ==50){
        println("a degeri,$a ya esittir")
    }else{
        println("a degeri hic bir sarta uygun degildir.")
    }

    println("------------------------")
    var yas:Int=21
    var isim:String="ahmet"

    if (yas>=18){
        println("resitsiniz")
    }else{
        println("resit degilsiniz")
    }

    println("------------------------")

    if (isim=="mehmet"){
        println("merhaba, hosgeldiniz $isim ")
    }else{
        println("kisi taninamadi")
    }

    println("------------------------")
    if (yas==21 && isim=="ahmet"){
        println("yeniden hosgeldiniz,$isim $yas")
    }else{
        println("hatali giris")
    }
    println("------------------------")


    if (yas==21) println("21 yasinda") else println("$yas yasinda")
}