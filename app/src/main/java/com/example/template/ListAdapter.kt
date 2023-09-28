package com.example.template

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(
    private val dataSet: MutableList<String>,
    private val callback: (text: String) -> Unit
) :
    RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem = view.findViewById<TextView>(R.id.tvItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvItem.run {
            text = dataSet[position]
            setOnClickListener {
                callback(dataSet[position])
            }
        }
    }

    override fun getItemCount() = dataSet.size
}