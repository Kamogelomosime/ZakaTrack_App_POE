package com.example.ZakaTrack


data class CategorySummary(
    val id: Long,
    val name: String,
    val totalSpent: Double,
    val budget: Double = 0.0
)
