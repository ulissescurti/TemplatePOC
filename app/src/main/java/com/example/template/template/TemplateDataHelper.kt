package com.example.template.template

object TemplateDataHelper {
    fun getMockedTemplateData(): TemplateData {
        val response = TemplateData(mutableListOf()).apply {
            for (i in 1..50) {
                val text = TemplateText("Text $i")
                elements.add(text)
            }
            elements.add(
                TemplateButton("Call to action", android.R.color.holo_red_light)
            )
            elements.add(TemplateText("Texto abaixo do botão"))
        }

        return response
    }
}

