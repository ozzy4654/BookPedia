package com.plcoding.bookpedia

import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.plcoding.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book_list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    BookListScreenRoot(
        viewModel = remember { BookListViewModel() },
        onBookClick = {

        },
    )

}