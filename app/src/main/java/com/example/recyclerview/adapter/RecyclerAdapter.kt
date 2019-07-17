package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.recTitle.text = titles[position]
        holder.recDetail.text = details[position]
        holder.recImage.setImageResource(images[position])
    }
    private val titles = arrayOf("Item One",
        "Item Two", "Item Three", "Item Four",
        "Item Five", "Item Six", "Item Seven",
        "Item Eight")

    private val details = arrayOf("Item one details", "Item two details",
        "Item three details", "Item four details",
        "Item file details", "Item six details",
        "Item seven details", "Item eight details")

    private val images = intArrayOf(R.drawable.photo,R.drawable.photo,R.drawable.photo,
        R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo)

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val layout = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_of_recycl, viewGroup, false)
        return ViewHolder(layout)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var recImage: ImageView
        var recTitle: TextView
        var recDetail: TextView

        init {
            recImage = itemView.findViewById(R.id.rec_image)
            recTitle = itemView.findViewById(R.id.rec_title)
            recDetail = itemView.findViewById(R.id.rec_detail)
        }
    }


}