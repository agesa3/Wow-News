package com.agesadev.wownews.repository

import com.agesadev.wownews.api.RetrofitInstance
import com.agesadev.wownews.db.ArticleDatabase
import retrofit2.Retrofit

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}