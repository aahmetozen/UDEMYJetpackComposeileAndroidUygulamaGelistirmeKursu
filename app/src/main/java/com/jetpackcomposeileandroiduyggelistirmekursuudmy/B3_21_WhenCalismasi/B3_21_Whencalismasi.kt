package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_21_WhenCalismasi

/* Switch yapisinin adi degismis halidir else if yapisinin daha pratik kullanimidir
* case adi verilen durumlar saglanirsa kod calisir */

fun main(){
    val gun=3
    when(gun){
        1 -> println("pazartesi")
        2 -> println("sali")
        3 -> println("carsamba")
        4 -> println("persembe")
        5 -> println("cuma")
        6 -> println("cumartesi")
        7 -> println("pazar")
        else -> println("boyle bir gun yok")

    }
}