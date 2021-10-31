package com.mohit.androiddevchallenge.listing.mvi

/**
 * Side Effects
 */
sealed class PetListEffect {

    object LoadPets : PetListEffect()
}
