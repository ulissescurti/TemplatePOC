package com.example.template.template

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.template.ListAdapter
import com.example.template.databinding.FragmentTemplateBinding

abstract class TemplateFragment : Fragment() {

    private var _binding: FragmentTemplateBinding? = null
    protected val binding get() = _binding!!

    private val viewModel: TemplateViewModel by activityViewModels()

    private var adapter: ListAdapter? = null

    abstract fun getTemplateData(): TemplateData

    abstract fun clickCallback(element: Element)

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

        binding.run {
            tvHeader.run {
                val data = (templateData.elements[0] as TemplateText)
                text = data.value
                setOnClickListener {
                    clickCallback(data)
//                    viewModel.sendEvent(data)
                    viewModel.emitEvent(data)
                }
            }

            btnTop.run {
                val data = (templateData.elements[1] as TemplateButton)
                text = data.value
                setOnClickListener {
                    clickCallback(data)
//                    viewModel.sendEvent(data)
                    viewModel.emitEvent(data)
                }
            }

            adapter = ListAdapter((templateData.elements[2] as TemplateList).items) { data ->
                clickCallback(data)
//                viewModel.sendEvent(data)
                viewModel.emitEvent(data)
            }
            rvButtons.adapter = adapter
        }
    }
}


