package com.mohit.androiddevchallenge.usecase

import com.mohit.androiddevchallenge.Pet
import com.mohit.androiddevchallenge.data.PetRepository
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Maybe
import javax.inject.Inject

class PetUseCase @Inject constructor(private val petRepository: PetRepository) {

    fun getPets(): Flowable<List<Pet>> {
        return petRepository.getListPets().toFlowable()
    }

    fun getPet(id: String): Maybe<Pet> {
        return petRepository.getPet(id)
    }
}
