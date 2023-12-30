package com.example.foodkorner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecipeListActivity : AppCompatActivity() {

    private lateinit var recipeList: RecyclerView
    private lateinit var adapter: RecipeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        recipeList = findViewById(R.id.recipeListRecyclerView)
        adapter = RecipeAdapter(getDummyRecipeList()) // Replace with actual data
        recipeList.layoutManager = LinearLayoutManager(this)
        recipeList.adapter = adapter
    }

    private fun getDummyRecipeList(): List<Recipe> {
        return listOf(
            Recipe("Pancakes", "Breakfast", 2, "Beginner", listOf("Flour", "Milk", "Eggs"), listOf("Step 1", "Step 2")),
            Recipe("Caesar Salad", "Lunch", 4, "Intermediate", listOf("Lettuce", "Chicken", "Croutons"), listOf("Step 1", "Step 2"))
        )
    }
}
