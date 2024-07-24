package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_18_IfYapisi

import java.util.Scanner

/* Kullanicidan alinan secime gore hesap yapan program */

fun  main(){
    println("dikdortgen alanin icin 1 cember alani icin 2 ye basiniz")
    var scanner=Scanner(System.`in`)
    var secim=scanner.nextInt()


    if (secim==1){
        println("uzun kenar giriniz:")
        var uzunK=scanner.nextInt()
        println("kisa kenar giriniz")
        var kisaK=scanner.nextInt()
        var sonucD=kisaK*uzunK
        println("dikdortgen alani:$sonucD"  )
    }else if (secim==2){
        println("yaricap giriniz")
        var yariC=scanner.nextInt()
        var p:Double=3.14
        var sonucC:Double=p*yariC*yariC
        println("Cember alani:$sonucC")
    }else{
        println("hatali secim!")
    }
}