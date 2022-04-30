package com.agesadev.wownews.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.agesadev.wownews.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {
}