package com.github.ainul.suarafm.ui.main.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.ainul.core.data.remote.model.PodcastModel
import com.github.ainul.suarafm.databinding.ListPodcastBinding

class RecentlyUploadedAdapter(
    private val context: Context
) : RecyclerView.Adapter<RecentlyUploadedAdapter.ViewHolder>() {
    var data: List<PodcastModel> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    inner class ViewHolder(private val binding: ListPodcastBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(e: PodcastModel) {
            binding.cover.setImageResource(e.imgSrc)
            binding.title.text = e.title
            binding.author.text = e.author
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = LayoutInflater.from(context)
        val view = ListPodcastBinding.inflate(item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount() = data.size
}