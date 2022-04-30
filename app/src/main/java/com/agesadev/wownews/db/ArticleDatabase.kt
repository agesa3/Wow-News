package com.agesadev.wownews.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.agesadev.wownews.model.Article

@Database(
    entities = [Article::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticleDatabase : RoomDatabase() {

    abstract fun getArticleDao(): ArticleDao

    companion object {
        @Volatile  //writes to this field are immediately made visible to other threads.
        private var instance: ArticleDatabase? = null
        private val LOCK =
            Any() //use this to synchronize setting the instance to ensure there is only one single instance of our db

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also {
                instance = it
            }

        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext, ArticleDatabase::class.java,
            "article_db.db"
        ).build()
    }
}