package com.example.template.template

object TemplateDataHelper {
    fun getMockedTemplateData(): TemplateData {
        val response = TemplateData(mutableListOf()).apply {
            elements.add(TemplateText("Primeiro texto da lista de elementos"))
            elements.add(
                TemplateButton("Botão no começo", android.R.color.holo_blue_light)
            )
            for (i in 1..50) {
                val text = TemplateText("Text $i")
                elements.add(text)
            }
            elements.add(
                TemplateButton("Botão no final", android.R.color.holo_green_light)
            )
            elements.add(TemplateText("Último elemento"))
        }

        return response
    }
}

