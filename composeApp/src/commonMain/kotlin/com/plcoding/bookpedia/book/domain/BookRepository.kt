package com.plcoding.bookpedia.book.domain

import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result

interface BookRepository {

    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>

    //not using dataerror.remote as we might fetch this from our local database later etc...
    suspend fun getBookDescription(bookId: String): Result<String?, DataError>

}