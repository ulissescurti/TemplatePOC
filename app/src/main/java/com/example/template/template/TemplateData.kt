package com.example.template.template

import androidx.annotation.ColorRes

data class TemplateData(
    val elements: MutableList<Element>
)

open class Element
data class TemplateButton(val value: String) : Element()
data class TemplateText(val value: String) : Element()
data class TemplateList(val items: MutableList<TemplateButton>) : Element()