package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_70_CollectionsArraylist

// arraylistte nesneye erismek icin index numarasini bilmek gerekir
fun main(){
    val meyveler=ArrayList<String>()
    val liste2=ArrayList<Int>()
    meyveler.add("cilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler.toString())

    val str=meyveler.get(2)
    println(str)

    val str2=meyveler[4]
    println(str2)
    println("--------------------------")

    meyveler.add("mandalina")
    println(meyveler.toString())
    println("--------------------------")

    meyveler[2]="ananas"
    println(meyveler.toString())
    println("--------------------------")
    meyveler.add(3,"portakal")
    println(meyveler.toString())
}