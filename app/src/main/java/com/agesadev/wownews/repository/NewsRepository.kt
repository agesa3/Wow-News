package com.agesadev.wownews.repository

import com.agesadev.wownews.api.RetrofitInstance
import com.agesadev.wownews.db.ArticleDatabase
import com.agesadev.wownews.model.Article
import retrofit2.Retrofit

class NewsRepository (
    val db: ArticleDatabase
):NewsRepoInterface{

    override suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    override suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchNews(searchQuery, pageNumber)

    override suspend fun insertToDB(article: Article) = db.getArticleDao().insert(article)

    override fun getSavedNews() = db.getArticleDao().getAllArticles()

    override suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}