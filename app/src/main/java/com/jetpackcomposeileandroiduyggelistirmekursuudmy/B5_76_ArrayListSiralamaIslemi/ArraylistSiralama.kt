package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B5_76_ArrayListSiralamaIslemi

fun main(){
    val k1=Kisiler(1,"ahmet")
    val k2=Kisiler(2,"zeynep")
    val k3=Kisiler(3,"berna")

    val kisilerArrayList=ArrayList<Kisiler>() // icinde kisiler sinifindan nesneleri tutar

    kisilerArrayList.add(k1)
    kisilerArrayList.add(k2)
    kisilerArrayList.add(k3)

    println("Once")

    for(k in kisilerArrayList){
        println("${k.kisino} - ${k.kisiadi}")
    }

    println("sayisal kucuten buyuge")

    val siralamaArrayList1=kisilerArrayList.sortedWith(compareBy{it.kisino})

    for (k in siralamaArrayList1){
        println("${k.kisino} - ${k.kisiadi}")
    }
    println("sayisal buyukten kucuge")
    val siralamaArrayList2=kisilerArrayList.sortedWith(compareByDescending{it.kisino})
    for (k in siralamaArrayList2){
        println("${k.kisino} - ${k.kisiadi}")
    }
    println("alfabetik buyukten kucuge")
    val siralamaArrayList3=kisilerArrayList.sortedWith(compareByDescending { it.kisiadi })
    for (k in siralamaArrayList3){
        println("${k.kisino} - ${k.kisiadi}")
    }
}