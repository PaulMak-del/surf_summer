package com.example.surf_summer1.model.repository.injection

import com.example.surf_summer1.model.repository.CocktailRepository
import com.example.surf_summer1.model.repository.ICocktailRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindCocktailRepository(cocktailRepository: CocktailRepository) : ICocktailRepository
}