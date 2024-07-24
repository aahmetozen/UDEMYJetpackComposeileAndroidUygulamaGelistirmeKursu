package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B2_9_Degiskenkapsami

class B2_9_Degiskenkapsami {
    // suslu parantez bizim kapsamimizi belirler. Degiskenin ulasilabilirligi buna baglidir
    var x=10 // global degisken
    var y=20

    fun topla(){

        var x = 40 // local degisken (yani fonksiyonun icindeyken bu deger gecerli olacak)
        // local degisken globali ezer
        var z = x+y
        println(z)
    }
}