package com.example.template.element

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.template.template.Element
import com.example.template.template.TemplateButton
import com.example.template.template.TemplateText

class ElementViewFactory : ElementView {

    override fun createView(context: Context, element: Element): View? {
        return when (element) {
            is TemplateButton -> {
                Button(context).apply {
                    text = element.value
                    element.backgroundColor?.let {
                        setBackgroundColor(ContextCompat.getColor(context, it))
                    }
                }
            }

            is TemplateText -> {
                TextView(context).apply {
                    text = element.value
                }
            }

            else -> null
        }
    }
}

interface ElementView {
    fun createView(context: Context, element: Element): View?
}