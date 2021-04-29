package com.xymenapps.demo.main.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.xymenapps.demo.R
import com.xymenapps.demo.main.models.MainRecyclerViewModel

class MainRecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(R.id.main_recyclerview_item_title)
    fun bindData(item: MainRecyclerViewModel) {
        title.text = item.title
    }

}
