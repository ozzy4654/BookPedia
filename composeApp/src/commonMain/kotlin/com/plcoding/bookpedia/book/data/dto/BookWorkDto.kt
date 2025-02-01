package com.plcoding.bookpedia.book.data.dto

import kotlinx.serialization.Serializable

// we need a custom serializer due to the bad api
// the api will sometimes return a string and other times return a json object
/// this shows that the api was not really designed with mobile in mind.

@Serializable(with = BookWorkDtoSerializer::class)
data class BookWorkDto(
    val description: String? = null
)
