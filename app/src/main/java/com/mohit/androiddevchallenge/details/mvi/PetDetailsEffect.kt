package com.mohit.androiddevchallenge.details.mvi

import com.mohit.androiddevchallenge.mobius.MobiusEffect

sealed class PetDetailsEffect : MobiusEffect {

    data class LoadPet(val petId: String) : PetDetailsEffect()
}
