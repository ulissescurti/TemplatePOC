package com.example.template.template

import androidx.annotation.ColorRes

data class TemplateData(
    val elements: MutableList<Element>
)

open class Element
class TemplateButton(val value: String, @ColorRes val backgroundColor: Int? = null) : Element()
class TemplateText(val value: String) : Element()

