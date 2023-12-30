package com.example.foodkorner

data class Recipe(
    val title: String,
    val type: String,
    val servingSize: Int,
    val difficultyLevel: String,
    val ingredients: List<String>,
    val preparationSteps: List<String>
)
