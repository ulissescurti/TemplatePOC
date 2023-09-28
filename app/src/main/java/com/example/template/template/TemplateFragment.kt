package com.example.template.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.template.databinding.FragmentTemplateBinding
import com.example.template.element.ElementViewFactory

abstract class TemplateFragment : Fragment() {

    private var _binding: FragmentTemplateBinding? = null
    protected val binding get() = _binding!!

    abstract fun getTemplateData(): TemplateData

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTemplateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
    }

    private fun setupUI() {
        val templateData = getTemplateData()
        val elementViewFactory = ElementViewFactory()
        templateData.elements.forEach { element ->
            binding.containerTemplate.addView(
                elementViewFactory.createView(requireContext(), element)
            )
        }
    }
}


