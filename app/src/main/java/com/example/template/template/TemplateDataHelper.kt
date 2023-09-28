package com.example.template.template

object TemplateDataHelper {
    fun getMockedTemplateData(): TemplateData {
        val response = TemplateData(mutableListOf()).apply {
            elements.add(TemplateText("Primeiro texto da lista de elementos", 16))
            elements.add(
                TemplateButton("Botão no começo", android.R.color.holo_blue_light, 8)
            )
            for (i in 1..15) {
                val text = TemplateText("Text $i", 16)
                elements.add(text)
            }
            elements.add(
                TemplateButton("Botão no final", android.R.color.holo_green_light, 8)
            )
            elements.add(TemplateText("Último elemento", 8))
        }

        return response
    }
}

