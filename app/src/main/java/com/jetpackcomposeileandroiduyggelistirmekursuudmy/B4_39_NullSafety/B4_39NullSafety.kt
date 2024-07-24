package com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_39_NullSafety

import com.jetpackcomposeileandroiduyggelistirmekursuudmy.B4_38_OtobusAnalojisi.Otobus

/* Global degisken olustururken degiskene belirli bir deger vermeden olusturmak
*  isteyebiliriz. Degiskeni? ile tanimlamaliyiz, ? isareti kullanilirsa null hatasindan
*  kaynakli olabilecek cokmelereden korunur
*  tanimladiktan sonra !! isareti kullanilirsa bu degiskenin null olabilecegini belirtmis oluruz */

fun main(){
    var str1:String?=null // null olabilir
    str1?.trim() // burada ister soru isareti ister unlem kullanabilir

    // yada if ile kontrol edebiliriz
    if (str1!=null){ // str1 null degilse trim yap
        str1.trim()
    }

    // Lateinit: bir degisken olsuturulurken hic bir deger atamak istemeyebiliriz.
    // bu durumda lateinit keyword u kullanilabilir. Lateinit ile birlikte !! veya ?
    // kullanmak zorunda degiliz fakat degisken null oldugunda cokme olabilir bunu goze almaliyiz.
    // primitif turlerde kullanilmaz(integer yada boolean gibi) ve var kelimesi ile kullanilir

    lateinit var otobus:Otobus
        //ya yukaridaki yada assadaki gibi kullanabiliriz
    var otobu:Otobus?=null
}