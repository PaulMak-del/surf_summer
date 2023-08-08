package com.example.surf_summer1.model.db.injection

import android.content.Context
import androidx.room.Room
import com.example.surf_summer1.model.db.AppDatabase
import com.example.surf_summer1.model.db.CocktailDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class PersistenceModule {

    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "app-database"
        ).build()

    @Provides
    fun provideCocktailDao(appDatabase: AppDatabase) : CocktailDao =
        appDatabase.cocktailDao()
}