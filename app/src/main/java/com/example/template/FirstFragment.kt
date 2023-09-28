package com.example.template

import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.template.template.Element
import com.example.template.template.TemplateData
import com.example.template.template.TemplateDataHelper
import com.example.template.template.TemplateFragment

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : TemplateFragment() {

    override fun getTemplateData(): TemplateData {
        return TemplateDataHelper.getMockedTemplateData()
    }

    override fun clickCallback(element: Element) {
        Toast.makeText(requireContext(), element.toString(), Toast.LENGTH_SHORT).show()
    }
}