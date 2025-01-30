package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = books,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null,
    )

val books = (1 ..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imgUrl = "http.test.com",
        authors = listOf("Ozan Kalan"),
        description = "Description: $it",
        languages = emptyList(),
        firstPublishedYear = null,
        numPages = 100,
        averageRating = 4.6979,
        numEditions = 3,
        ratingCount = 5

    )
}