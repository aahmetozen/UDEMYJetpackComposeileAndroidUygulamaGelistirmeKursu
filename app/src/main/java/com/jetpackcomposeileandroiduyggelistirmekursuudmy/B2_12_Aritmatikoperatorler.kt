package com.jetpackcomposeileandroiduyggelistirmekursuudmy

//matematiksel islemleri yapmamizi saglar.
fun main(){
    //Daire alani
    val pi=3.14

    var yaricap=2.0
    var alan = pi * yaricap * yaricap
    println("Daire alani: $alan")


    println("----------------------")
    // F = m * a

    var m=12.5
    var a=10.0

    var F=m*a
    println("F:$F")

    println("----------------------")
    //Delta x
    var v=12.7
    var v0=23.56
    var t= 3.5

    var x1=((v+v0)/2)*t

    println("x1:$x1")
    println("----------------------")


    var y0=12.5
    var r=5.0
    var b=23.4

    var deger=(y0*r)+(1/2*b*t*t)
    println("x2:$deger")

    println("----------------------")

    var y=10
    println("ilkdeger:$y")

    y=y+2
    println("ikiartti:$y")

    y+=2
    println("kisaltmaylaiki artti:$y")

    y-=4
    println("kisaltmayladort azaldi:$y")



}