package com.superking.parchi.ooootheer2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.superking.parchi.R
import com.superking.parchi.databinding.SloootyBinding
import com.superking.parchi.ooootheer2.oo1o1.DiffUtilItem
import com.superking.parchi.ooootheer2.oo1o1.SlotElement

class SlotListAdapterrrrrrr :
    ListAdapter<SlotElement, SlotListAdapterrrrrrr.SlotListVievHolder>(DiffUtilItem()) {


    class SlotListVievHolder(view: View) : RecyclerView.ViewHolder(view) {
        val bindingdfrgtt = SloootyBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlotListVievHolder {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.sloooty, parent, false).also {
                return SlotListVievHolder(it)
            }
    }

    override fun onBindViewHolder(holder: SlotListVievHolder, position: Int) {
        val rgyhyyhyh = getItem(position)
        holder.bindingdfrgtt.imgOnSingleItem.setImageResource(rgyhyyhyh.imagedfrgt)
    }
}

