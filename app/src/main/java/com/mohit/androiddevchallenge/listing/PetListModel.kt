package com.mohit.androiddevchallenge.listing

import com.mohit.androiddevchallenge.Pet

data class PetListModel(
    val state: ScreenState = ScreenState.Loading,
    val listPets: List<Pet> = emptyList()
)

enum class ScreenState {
    Loading,
    Loaded
}
