package com.plcoding.bookpedia.book.domain

data class Book(
    val id: String,
    val title: String,
    val imgUrl: String,
    val description: String?,
    val authors: List<String>,
    val languages: List<String>,
    val firstPublishedYear: String?,
    val averageRating: Double?,
    val ratingCount: Int?,
    val numPages: Int?,
    val numEditions: Int
)
