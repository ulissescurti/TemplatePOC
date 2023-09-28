package com.example.template

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.template.template.TemplateButton

class ListAdapter(
    private val dataSet: MutableList<TemplateButton>,
    private val callback: (text: TemplateButton) -> Unit
) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val btnItem = view.findViewById<Button>(R.id.btnItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.btnItem.run {
            text = dataSet[position].value
            setOnClickListener {
                callback(dataSet[position])
            }
        }
    }

    override fun getItemCount() = dataSet.size
}