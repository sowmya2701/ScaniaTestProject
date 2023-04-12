package com.example.scaniatestproject.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.example.scaniatestproject.databinding.AdapterMovieBinding


class DogAdapter(private val onClickListener: ItemClickListener): RecyclerView.Adapter<MainViewHolder>() {
    var movies = mutableListOf<String>()
    var position:Int = 0
    @SuppressLint("NotifyDataSetChanged")
    fun setMovieList(movies: List<String>) {
        this.movies = movies.toMutableList()
        notifyDataSetChanged()
    }

    fun getMoviesList() : List<String> {
        return this.movies
    }
    @NonNull
    override fun onCreateViewHolder(@NonNull parent: ViewGroup, viewType: Int): MainViewHolder =
        MainViewHolder(AdapterMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.apply {
            bind(movies[position])
        }
        holder.itemView.setOnClickListener {
            if(position >= 0) {
                onClickListener.onItemClick(position,it)
            }
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    interface ItemClickListener {
        fun onItemClick(position: Int, view:View)
        fun onLongClick(position: Int)
    }
}

class MainViewHolder(val binding: AdapterMovieBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(dogName: String) {
        binding.textView.text = dogName
    }
}
