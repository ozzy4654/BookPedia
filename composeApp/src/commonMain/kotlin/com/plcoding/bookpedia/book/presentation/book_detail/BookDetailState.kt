package com.plcoding.bookpedia.book.presentation.book_detail

import com.plcoding.bookpedia.book.domain.Book

data class BookDetailState(
    val isFavorite: Boolean = false,
    val isLoading: Boolean = true,
    val book: Book? = null,
)