package com.example.surf_summer1.di

import com.example.surf_summer1.domain.usecases.GetCocktailUseCase
import com.example.surf_summer1.domain.usecases.GetCocktailsListUseCase
import com.example.surf_summer1.model.repository.CocktailRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    @ViewModelScoped
    fun provideGetCocktailUseCase(rep: CocktailRepository) = GetCocktailUseCase(rep)

    @Provides
    @ViewModelScoped
    fun provideGetCocktailsListUseCase(rep: CocktailRepository) = GetCocktailsListUseCase(rep)
}