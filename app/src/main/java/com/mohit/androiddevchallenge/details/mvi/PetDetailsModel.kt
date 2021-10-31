package com.mohit.androiddevchallenge.details.mvi

import com.mohit.androiddevchallenge.Pet

data class PetDetailsModel(
    val viewState: ViewState = ViewState.LOADING,
    val pet: Pet? = null
)

enum class ViewState {
    LOADING,
    LOADED
}
