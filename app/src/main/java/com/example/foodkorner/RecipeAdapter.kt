package com.example.foodkorner

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter(
    private val recipes: List<Recipe>,
    private val listener: OnItemClickListener
) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    // Interface for item click listener
    interface OnItemClickListener {
        fun onRecipeClick(recipe: Recipe)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.bind(recipe)

        // Set click listener on the item view
        holder.itemView.setOnClickListener {
            // Invoke the onRecipeClick method of the listener
            listener.onRecipeClick(recipe)
        }
    }

    override fun getItemCount(): Int = recipes.size

    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)

        fun bind(recipe: Recipe) {
            titleTextView.text = recipe.title

            // Add more bindings for other recipe details if needed
        }
    }
}
