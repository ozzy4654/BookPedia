package com.plcoding.bookpedia.book.data.mappers

import com.plcoding.bookpedia.book.data.database.BookEntity
import com.plcoding.bookpedia.book.data.dto.SearchedBookDto
import com.plcoding.bookpedia.book.domain.Book

fun SearchedBookDto.toBook(): Book {
    return Book(
        id = id.substringAfterLast("/"),
        title = title,
        imgUrl = if (coverKey != null) {
            "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
        } else {
            "https://covers.openlibrary.org/b/olid/${coverAlternativeKey}-L.jpg"
        },
        description = null,
        authors = authorNames ?: emptyList(),
        languages = languages ?: emptyList(),
        firstPublishedYear = firstPublishedYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions ?: 0,
    )
}

fun Book.toBookEntity(): BookEntity {
    return BookEntity(
        id = id,
        title = title,
        description = description.orEmpty(),
        imageUrl = imgUrl,
        languages = languages,
        authors = authors,
        firstPublishYear = firstPublishedYear,
        ratingsAverage = averageRating,
        ratingsCount = ratingCount,
        numPagesMedian = numPages,
        numEditions = numEditions
    )
}

fun BookEntity.toBook(): Book {
    return Book(
        id = id,
        title = title,
        description = description.orEmpty(),
        imgUrl = imageUrl,
        languages = languages,
        authors = authors,
        firstPublishedYear = firstPublishYear,
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numPages = numPagesMedian,
        numEditions = numEditions
    )
}
