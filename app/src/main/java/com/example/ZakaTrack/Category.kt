package com.example.ZakaTrack

// Category.kt

data class Category(
    val id: Long = 0,
    val name: String,
    val color: String,
    val budget: Double,
    val userId: Long
)