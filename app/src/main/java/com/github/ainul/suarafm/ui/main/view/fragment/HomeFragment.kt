package com.github.ainul.suarafm.ui.main.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.ainul.suarafm.R
import com.github.ainul.core.data.remote.model.PodcastModel
import com.github.ainul.suarafm.databinding.FragmentHomeBinding
import com.github.ainul.suarafm.ui.main.view.adapter.PopularPodcastAdapter
import com.github.ainul.suarafm.ui.main.view.adapter.RecentlyUploadedAdapter

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: PopularPodcastAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        setupRecyclerView()

        // Inflate the layout for this fragment
        return binding.root
    }

    private fun setupRecyclerView() {
        adapter = PopularPodcastAdapter(this.requireContext())
        val recentlyUploadedAdapter = RecentlyUploadedAdapter(this.requireContext())
        binding.popularPodcastList.adapter = adapter
        binding.recentlyUploadedList.adapter = recentlyUploadedAdapter

        val sampleData = arrayListOf<PodcastModel>(
            PodcastModel(
                title = "The Road Ahead",
                author = "Bill Gates",
                imgSrc = R.drawable.cover_sample_1
            ),
            PodcastModel(
                title = "Steve Jobs",
                author = "Steve Jobs",
                imgSrc = R.drawable.cover_sample_2
            ),
            PodcastModel(
                title = "leadership itu dipraktekin",
                author = "Tim Wesfix",
                imgSrc = R.drawable.cover_sample_3
            ),
            PodcastModel(
                title = "Steve Jobs 2",
                author = "Steve Jobs",
                imgSrc = R.drawable.cover_sample_2
            ),
        )

        adapter.data = sampleData
        recentlyUploadedAdapter.data = sampleData
    }
}