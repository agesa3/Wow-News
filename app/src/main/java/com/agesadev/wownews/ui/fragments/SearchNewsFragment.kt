package com.agesadev.wownews.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agesadev.wownews.MainActivity
import com.agesadev.wownews.R
import com.agesadev.wownews.ui.viewmodel.NewsViewModel


class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }


}