package com.agesadev.wownews.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.agesadev.wownews.MainActivity
import com.agesadev.wownews.R
import com.agesadev.wownews.ui.viewmodel.NewsViewModel


class ArticlesFragment : Fragment() {

    lateinit var viewModel: NewsViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        try {
            val view = inflater.inflate(R.layout.fragment_articles, container, false)
            return view
        } catch (e: Exception) {
            Log.e("TAG", "onCreateView", e);
            throw e;
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }


}