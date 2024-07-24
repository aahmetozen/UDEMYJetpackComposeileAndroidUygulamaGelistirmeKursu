package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_70_CollectionsArraylist

fun main(){
    val meyveler=ArrayList<String>()
    meyveler.add("cilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("kiraz")

    for (meyve in meyveler){
        println("sonuc:$meyve")
    }
    for ((index,meyve) in meyveler.withIndex()){
        println("sonuc:$index:$meyve")
    }
}