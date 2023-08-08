package com.example.surf_summer1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.surf_summer1.R
import com.example.surf_summer1.model.db.CocktailEntity

class CocktailsAdapter(
    private val cocktailsSet: List<CocktailEntity>
) : RecyclerView.Adapter<CocktailsAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        val imageView: ImageView

        init {
            textView = view.findViewById(R.id.recycler_item_text)
            imageView = view.findViewById(R.id.recycler_item_image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cocktail_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cocktailsSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = cocktailsSet[position].name
        holder.imageView.setImageResource(cocktailsSet[position].image)
    }
}