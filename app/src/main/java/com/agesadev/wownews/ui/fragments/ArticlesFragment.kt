package com.agesadev.wownews.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import com.agesadev.wownews.MainActivity
import com.agesadev.wownews.R
import com.agesadev.wownews.ui.viewmodel.NewsViewModel
import kotlinx.android.synthetic.main.fragment_articles.*


class ArticlesFragment : Fragment(R.layout.fragment_articles) {

    lateinit var viewModel: NewsViewModel
   private val args:ArticlesFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
        val article = args.art

        webView.apply {
            webViewClient = WebViewClient()
            if (article != null) {
                loadUrl(article.url)
            }
        }

    }


}