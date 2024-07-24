package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_34_BaziHazirKomutlar

import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.random.Random

fun main(){
    for (i in 1..5){
        val randomvalue= Random.nextInt(0,10) // 0 ile 9 arasinda rastgele sayi
        println(randomvalue)
    }
    println("-----------------")
    val c= ceil(6.5) // sayiyi yuvarlar
    println(c)
    println("-----------------")
    val s= sqrt(4.0) // sayinin karekokunu verir
    println(s)
    println("-----------------")
    val a= abs(-10) // sayinin mutlak degerini verir
    println(a)
    println("-----------------")
    val mx= max(100,200) // verdigimiz sayilardan max olani dondurur
    val mn= min(100,200) // verdigimiz sayilardan min olani dondurur
    println(mx)
    println(mn)
    println("-----------------")
    val p=2.0.pow(3.0) // uslu sayi islmein yapmamizi saglar (2 uzeri 3)
    println(p)


}