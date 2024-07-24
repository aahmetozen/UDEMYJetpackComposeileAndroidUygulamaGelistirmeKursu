package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_77_ArryList_Filtreleme

fun main(){
    val o1=Ogrenciler("ahmet",1,"11f")
    val o2=Ogrenciler("zeynep",2,"10r")
    val o3=Ogrenciler("ceyda",3,"12a")
    val o4=Ogrenciler("mehmet",4,"9z")
    val o5=Ogrenciler("yasin",5,"11f")

    val ogrenciler=ArrayList<Ogrenciler>()
    ogrenciler.add(o1)
    ogrenciler.add(o2)
    ogrenciler.add(o3)
    ogrenciler.add(o4)
    ogrenciler.add(o5)

    val  sonucliste1=ogrenciler.filter { it.no > 2 }
    val  sonucliste2=ogrenciler.filter { (it.ad).contains("a") }


    for (o in ogrenciler){
        println("***********")
        println("ogrenci no${o.no}")
        println("ogrenci ad${o.ad}")
        println("ogrenci sinif${o.sinif}")

    }
    println("ogrenci no buyuk 2 olanlar")
    for (o in sonucliste1){
        println("***********")
        println("ogrenci no${o.no}")
        println("ogrenci ad${o.ad}")
        println("ogrenci sinif${o.sinif}")

    }
    println("isminde a harfi olanlar")
    for (o in sonucliste2){
        println("***********")
        println("ogrenci no${o.no}")
        println("ogrenci ad${o.ad}")
        println("ogrenci sinif${o.sinif}")

    }

}