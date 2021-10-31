package com.mohit.androiddevchallenge.listing.mvi

import com.mohit.androiddevchallenge.mobius.MobiusViewEffect

/**
 * View related once off effects that need to happen, ie navigate to a new screen. Show a toast etc.
 */
sealed class PetListViewEffect : MobiusViewEffect {
    data class ShowPetDetails(val petId: String) : PetListViewEffect()
}
