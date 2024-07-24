package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B3_18_IfYapisi

import java.util.Scanner

/* kullanicidan alinan secime gore dort islem yapan program */

fun main(){
    var scanner=Scanner(System.`in`)
    println("birinci sayiyi girin:")
    var sayi1=scanner.nextLine().toDouble()
    println("ikinci sayiyi girin:")
    var sayi2=scanner.nextLine().toDouble()
    println("Toplama(1)\n Cikarma(2) \n Carpma(3) \n Bolme(4)")
    var secim=scanner.nextInt()
    if (secim==1){
        var sonucT=sayi1+sayi2
        println("Toplama sonucu:$sonucT")
    }else if (secim==2){
        var sonucCk=sayi1-sayi2
        println("Cikarma sonucu:$sonucCk")
    }else if (secim==3){
        var sonucCp=sayi1*sayi2
        println("Carpma sonucu:$sonucCp")
    }else if (secim==4){
        var sonucB=sayi1/sayi2
        if (sayi2==0.0){
            println("sifira bolme hatasi ")
        }else{
            println("Bolme sonucu:$sonucB")
        }
    }else{
        println("hatali secim yaptiniz!")
    }


}