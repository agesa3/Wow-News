package com.agesadev.wownews.repository

import androidx.lifecycle.LiveData
import com.agesadev.wownews.model.Article
import com.agesadev.wownews.model.NewsResponse
import retrofit2.Response

interface NewsRepoInterface {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int):Response<NewsResponse>
    suspend fun searchNews(searchQuery: String, pageNumber: Int):Response<NewsResponse>

    suspend fun insertToDB(article: Article):Long

    fun getSavedNews():LiveData<List<Article>>

    suspend fun deleteArticle(article: Article)

}