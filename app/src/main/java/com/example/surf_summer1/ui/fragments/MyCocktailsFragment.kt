package com.example.surf_summer1.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.surf_summer1.R
import com.example.surf_summer1.ui.CocktailsAdapter
import com.example.surf_summer1.viewModels.CocktailListViewModel
import com.example.surf_summer1.viewModels.CocktailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyCocktailsFragment : Fragment() {

    private val cocktailListViewModel : CocktailListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        lateinit var view: View
        Log.d("ddd", "fragment")
        //view = inflater.inflate(R.layout.fragment_my_cocktails, container, false)

        lateinit var adapter: CocktailsAdapter
        cocktailListViewModel.cocktails.observe(viewLifecycleOwner) { it ->
            adapter = CocktailsAdapter(it)
        }

        if (adapter.itemCount <= 0) {
            view = inflater.inflate(R.layout.fragment_my_cocktails, container, false)
        } else {
            view = inflater.inflate(R.layout.cocktails_recycler_list, container, false)
            val recyclerView : RecyclerView = view.findViewById(R.id.recycler_view)
            recyclerView.layoutManager = GridLayoutManager(context, 2)
            recyclerView.adapter = adapter
        }

        // Inflate the layout for this fragment
        return view
    }
}
