package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book

sealed interface BookListAction {
    // data object or data class
    data class OnSearchQueryChange(val query: String) : BookListAction
    data class OnBookClicked(val book: Book) : BookListAction
    data class OnTabSelected(val tab: Int) : BookListAction

}

