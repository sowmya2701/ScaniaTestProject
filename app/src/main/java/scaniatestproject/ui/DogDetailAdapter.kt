package com.example.scaniatestproject.ui

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.scaniatestproject.R
import com.example.scaniatestproject.databinding.DoglistDetailAdapterBinding

class DogDetailAdapter : RecyclerView.Adapter<DogDetailAdapter.DetailViewHolder>() {

    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): DetailViewHolder =
        DetailViewHolder(DoglistDetailAdapterBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: DetailViewHolder, position: Int) {
        holder.apply {
            bind(dogImagesList[position])
        }
    }

    var dogImagesList = mutableListOf<String>()

    @SuppressLint("NotifyDataSetChanged")
    fun setImageList(movies: ArrayList<String>?) {
        this.dogImagesList = movies?.toMutableList()!!
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return dogImagesList.size
    }

    class DetailViewHolder(val binding: DoglistDetailAdapterBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(imageUrl: String) {
            Log.d("Sowmya", "url:" + imageUrl)
             Glide.with(binding.imageview)
                 .load(imageUrl)
                 .circleCrop()
                 .placeholder(R.drawable.ic_launcher_foreground)
                 .error(R.drawable.ic_launcher_foreground)
                 .fallback(R.drawable.ic_launcher_foreground)
                 .into(binding.imageview)
        }

    }
}