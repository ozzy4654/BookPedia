package com.plcoding.bookpedia.app

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object BookGraph: Route


    @Serializable
    data object BookList: Route

    @Serializable
    data object BookDetail: Route

}