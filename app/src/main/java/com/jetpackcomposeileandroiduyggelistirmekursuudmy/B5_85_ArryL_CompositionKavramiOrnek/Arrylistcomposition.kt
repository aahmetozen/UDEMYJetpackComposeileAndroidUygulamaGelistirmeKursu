package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_85_ArryL_CompositionKavramiOrnek

import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)
    val personeller=ArrayList<Personel>()

    for (i in 1..5){
        println("$i. personel ad:")
        val isim=scanner.next()

        println("$i. personel adres il:")
        val il=scanner.next()

        println("$i. personel adres ilce:")
        val ilce=scanner.next()

        val adres=Adres(il,ilce)
        val personel=Personel(i,isim,adres)
        personeller.add(personel)
    }
    for (p in personeller){
        println("***************")
        println("personel no:${p.no}")
        println("personel ad:${p.isim}")
        println("personel il:${p.adres.il}")
        println("personel ilce:${p.adres.ilce}")
    }
}