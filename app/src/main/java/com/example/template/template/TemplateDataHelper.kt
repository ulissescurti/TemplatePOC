package com.example.template.template

object TemplateDataHelper {

    fun getMockedTemplateData(): TemplateData {
        val response = TemplateData(mutableListOf()).apply {
            elements.add(TemplateText("Primeiro texto da lista de elementos"))
            elements.add(TemplateButton("Botão no começo"))
            val litItems = mutableListOf<TemplateButton>()
            for (i in 1..15) {
                val text = TemplateButton("Button $i")
                litItems.add(text)
            }
            elements.add(TemplateList(litItems))
        }

        return response
    }
}

