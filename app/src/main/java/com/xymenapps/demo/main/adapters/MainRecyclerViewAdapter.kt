package com.xymenapps.demo.main.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SortedList
import androidx.recyclerview.widget.SortedListAdapterCallback
import com.xymenapps.demo.R
import com.xymenapps.demo.main.listeners.MainRecyclerViewAdapterListener
import com.xymenapps.demo.main.listeners.MainRecyclerViewListener
import com.xymenapps.demo.main.models.MainRecyclerViewModel

class MainRecyclerViewAdapter(val listener: MainRecyclerViewListener) :
    RecyclerView.Adapter<MainRecyclerViewHolder>() {

    private val adapterListener = object: MainRecyclerViewAdapterListener{
        override fun onClicked(position: Int) {
            listener.onClicked(getItem(position))
        }
    }

    private var mData: SortedList<MainRecyclerViewModel> =
        SortedList(
            MainRecyclerViewModel::class.java,
            object : SortedListAdapterCallback<MainRecyclerViewModel>(this) {
                override fun compare(o1: MainRecyclerViewModel, o2: MainRecyclerViewModel): Int =
                    o1.title.compareTo(o2.title)

                override fun areContentsTheSame(
                    oldItem: MainRecyclerViewModel,
                    newItem: MainRecyclerViewModel
                ): Boolean = oldItem == newItem

                override fun areItemsTheSame(
                    item1: MainRecyclerViewModel,
                    item2: MainRecyclerViewModel
                ): Boolean = item1 == item2

            })

    init {
        mData.add(MainRecyclerViewModel("Room Database"))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainRecyclerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.main_recyclerview_item, parent, false)

        return MainRecyclerViewHolder(
            itemView = view,
            adapterListener = adapterListener
        )
    }

    override fun onBindViewHolder(holder: MainRecyclerViewHolder, position: Int) =
        holder.bindData(getItem(position))

    fun getItem(position: Int): MainRecyclerViewModel = mData.get(position)

    override fun getItemCount(): Int = mData.size()
}
