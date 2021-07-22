package com.bce.codeek.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bce.codeek.R
import com.bce.codeek.model.Details

class DetailsRVAdapter(private val details: ArrayList<Details>,
                       private val listener: DetailsRVItemClicked):
    RecyclerView.Adapter<DetailsViewHolder>(), DetailsRVItemClicked {

    //private val details = ArrayList<Details>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.details_template, parent, false)
        val viewHolder = DetailsViewHolder(view)
        view.setOnClickListener {
            listener.onItemClicked(details[viewHolder.absoluteAdapterPosition])
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        holder.textView.text = details[position].info
    }

    override fun getItemCount(): Int = details.size

    override fun onItemClicked(item: Details) {}
}

class DetailsViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.detailView)
}

interface DetailsRVItemClicked {
    fun onItemClicked(item: Details)
}