package com.xymenapps.demo.main.adapters

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.xymenapps.demo.R
import com.xymenapps.demo.main.listeners.MainRecyclerViewAdapterListener
import com.xymenapps.demo.main.models.MainRecyclerViewModel

class MainRecyclerViewHolder(itemView: View, val adapterListener: MainRecyclerViewAdapterListener) :
    RecyclerView.ViewHolder(itemView) {
    private val title: TextView = itemView.findViewById(R.id.main_recyclerview_item_title)
    private val root: CardView = itemView.findViewById(R.id.main_recyclerview_item)

    fun bindData(item: MainRecyclerViewModel) {
        title.text = item.title
        root.setOnClickListener { adapterListener.onClicked(absoluteAdapterPosition) }
    }

}
