package com.example.surf_summer1.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.surf_summer1.model.db.CocktailEntity
import com.example.surf_summer1.model.repository.ICocktailRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CocktailListViewModel @Inject constructor(
    private val cocktailRepository: ICocktailRepository
) : ViewModel() {

    private val _cocktails = MutableLiveData<List<CocktailEntity>>()
    val cocktails : LiveData<List<CocktailEntity>> = _cocktails

    fun loadCocktails() {
        viewModelScope.launch {
            cocktailRepository.getCocktails()
                .collect {
                    _cocktails.value = it
                }
        }
    }
}