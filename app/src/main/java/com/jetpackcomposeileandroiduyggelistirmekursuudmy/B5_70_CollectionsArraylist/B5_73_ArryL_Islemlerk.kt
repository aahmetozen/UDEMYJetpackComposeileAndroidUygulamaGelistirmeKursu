package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_70_CollectionsArraylist

fun main(){
    val meyveler=ArrayList<String>()
    meyveler.add("cilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    println(meyveler.isEmpty())
    println("--------------")
    println(meyveler.count())
    println(meyveler.size)
    println("--------------")
    println(meyveler.first())
    println(meyveler.last())
    println("--------------")
    println(meyveler.contains("kiraz")) // eleman var mi yok mu kontrol eder
    println("--------------")
    println(meyveler.max())
    println(meyveler.min())
    println("--------------")
    meyveler.sort()
    println(meyveler.toString())
    println("--------------")
    meyveler.reverse()
    println(meyveler.toString())
    println("--------------")
    meyveler.remove("kivi")
    println(meyveler.toString())
    println("--------------")
    meyveler.clear()
    println(meyveler.toString())

}