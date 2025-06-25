package com.example.ZakaTrack

// CategoryExpenseSummary.kt

data class CategoryExpenseSummary(
    val categoryId: Long,
    val categoryName: String,
    val categoryColor: String,
    val budget: Double,
    val totalSpent: Double
)