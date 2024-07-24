package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B6_90_StringGiris

fun main(){
    val str1="merhaba"
    println(str1.subSequence(0,3)) // 0 dan baslayip 3. harfe kadar gider(0,1,2)

    val str2="merhaba"
    if (str2.contains("er")){
        println("iceriyor")
    }

    val str3="merhaba"
    println(str3.toUpperCase()) // tum harfleri buyuk yazdirir
    val str4="MERHABA"
    println(str4.toLowerCase()) // tum harfleri kucuk yazdirir

    val str5="merhaba nasilsin"
    val dizi=str5.split(" ") // bosluga gore parcalar
    for (d in dizi){
        println(d)
    }

    val str6="merhaba"
    println(str6.trim()) // yazinin onundeki ve arkasindaki bosluklari kaldirir

}