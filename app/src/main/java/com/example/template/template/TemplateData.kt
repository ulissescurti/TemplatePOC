package com.example.template.template

import androidx.annotation.ColorRes

data class TemplateData(
    val elements: MutableList<Element>
)

open class Element(val marginInDp: Int)
class TemplateButton(val value: String, @ColorRes val backgroundColor: Int? = null, marginInDp: Int = 0) : Element(marginInDp)
class TemplateText(val value: String, marginInDp: Int = 0) : Element(marginInDp)

