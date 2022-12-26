package com.superking.parchi.ooootheer2.oo1o1

import androidx.recyclerview.widget.DiffUtil

class DiffUtilItem : DiffUtil.ItemCallback<SlotElement>() {
    override fun areItemsTheSame(oldItem: SlotElement, newItem: SlotElement): Boolean {
        return oldItem.edfrtgt == newItem.edfrtgt
    }

    override fun areContentsTheSame(oldItem: SlotElement, newItem: SlotElement): Boolean {
        return oldItem == newItem
    }
}