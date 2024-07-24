package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_24_Donguler

/* donugler belirli kodlari tekrarli calistirma amacli olusturulur */

fun main(){
    for (i in 3..5){//3,4,5
        println(i)
    }
    println("----------------------")
    var baslangic=10
    var bitis=20
    var artis=5
    for (a in baslangic..bitis step artis){// 10 dan 20 ye 5 er 5 er
        println("sayi:$a")
    }
    println("----------------------")
    for (c in 20 downTo 10 step 2){// 20 den 10 2ser 2 ser
        println("sayi:$c")
    }
    println("----------------------")
    for (s in 1 until 4){// 4 degerini dahil etmez yani 1,2,3
        println(s)
    }
    println("----------------------")
    var sayac=1

    while (sayac<4){
        println("sayac$sayac")
        sayac+=1
    }

}