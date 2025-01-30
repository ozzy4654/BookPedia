package com.plcoding.bookpedia

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book_list.BookListState
import com.plcoding.bookpedia.book.presentation.book_list.components.BookSearchBar
import com.plcoding.bookpedia.core.presentation.DesertWhite

@Preview()
@Composable
private fun BookSearchBarPreview() {
    MaterialTheme{
        BookSearchBar(
            searchQuery = "Bubbles",
            onSearchQueryChange = {},
            onImeSearch = {},
            modifier = Modifier.fillMaxWidth()
                .background(color = DesertWhite)
        )

    }
}


// mock data
private val books = (1 ..100).map {
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

@Preview
@Composable
private fun BookListScreenPreview() {

    BookListScreen(
        state = BookListState(
            searchResults = books
        ),
        onAction = {}
    )


}