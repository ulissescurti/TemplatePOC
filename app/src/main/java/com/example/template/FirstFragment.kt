package com.example.template

import androidx.fragment.app.Fragment
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


}