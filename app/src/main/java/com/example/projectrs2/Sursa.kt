package com.example.projectrs2

import com.example.projectrs2.models.ListaDulce

class Source{

    companion object{

        fun createDataSet(): ArrayList<ListaDulce>{
            val list = ArrayList<ListaDulce>()
            list.add(
                ListaDulce(
                    "Bine ati venit!",
                    "",
                    "https://www.bucuria.md/logo-ru.png",
                    "Bucuria"
                )
            )
            list.add(
                ListaDulce(
                    "Clepsidra",
                    "",
                    "https://www.bonina.ro/wp-content/uploads/2017/05/bomboane-bucuria-clepsidra-100-g-949.jpg",
                    "Ciocolata"
                )
            )

            list.add(
                ListaDulce(
                    "Chisinaul de seara",
                    "",
                    "https://www.auchan.ro/public/images/h54/h07/h00/bomboane-bucuria-chisinau-de-seara-glazurate-cu-ciocolata-300-g-8918485794846.jpg",
                    "Ciocolata"
                )
            )
            list.add(
                ListaDulce(
                    "Inspiratie visine",
                    "",
                    "https://s12emagst.akamaized.net/products/2665/2664306/images/res_04bbdb1504b71ed09bb56a7a55943531_full.jpg",
                    "Jeleuri"
                )
            )
            list.add(
                ListaDulce(
                    "Visine",
                    "",
                    "https://s12emagst.akamaized.net/products/14361/14360148/images/res_3f7059f09f9398c057222be3e7cf2019_full.jpg",
                    "Jeleuri"
                )
            )
            list.add(
                ListaDulce(
                    "Capricii caise",
                    "",
                    "https://d1lqpgkqcok0l.cloudfront.net/medias/sys_master/h17/h33/8862882201630.jpg",
                    "Jeleuri"
                )
            )
            list.add(
                ListaDulce(
                    "DO-RE-MI",
                    "",
                    "https://www.bonina.ro/wp-content/uploads/2017/05/bomboane-bucuria-do-re-mi-100-g-1025.jpg",
                    "Jeleuri/Arahide"
                )
            )
            list.add(
                ListaDulce(
                    "Moldova",
                    "",
                    "https://d1lqpgkqcok0l.cloudfront.net/medias/sys_master/h78/h4c/8862923948062.jpg",
                    "Ciocolata"
                )
            )
            list.add(
                ListaDulce(
                    "Cocos",
                    "",
                    "https://lh3.googleusercontent.com/proxy/FmiLBRm-9ytBQEk_qEZ-xX_fyRXz2Orp9ffhYT_A83Z73a3JaKV5_EmrB8JFZpO-O0ncTzbdz3UlVX_NYpswNXua7Vvxke70E0RgKbcG7HBunUM2h7xQKxA",
                    "Ciocolata"
                )
            )
            return list
        }
    }
}