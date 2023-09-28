package com.example.template.element

import android.content.Context
import android.content.res.Resources.getSystem
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.template.template.Element
import com.example.template.template.TemplateButton
import com.example.template.template.TemplateText

class ElementViewFactory {

    fun createView(context: Context, element: Element): View? {
        return when (element) {
            //Create the Button View
            is TemplateButton -> {
                Button(context).apply {
                    text = element.value
                    element.backgroundColor?.let {
                        setBackgroundColor(ContextCompat.getColor(context, it))
                        setPadding(
                            element.marginInDp.px,
                            element.marginInDp.px,
                            element.marginInDp.px,
                            element.marginInDp.px
                        )
                    }
                }
            }

            //Create the Text View
            is TemplateText -> {
                TextView(context).apply {
                    text = element.value
                    setPadding(
                        element.marginInDp.px,
                        element.marginInDp.px,
                        element.marginInDp.px,
                        element.marginInDp.px
                    )
                }
            }

            else -> null
        }
    }
}


val Int.px: Int get() = (this * getSystem().displayMetrics.density).toInt()
