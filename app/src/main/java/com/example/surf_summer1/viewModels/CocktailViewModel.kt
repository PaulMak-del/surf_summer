package com.example.surf_summer1.viewModels

import androidx.lifecycle.ViewModel
import com.example.surf_summer1.model.repository.CocktailRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CocktailViewModel @Inject constructor(
    private val cocktailRepository: CocktailRepository,
) : ViewModel() {

}