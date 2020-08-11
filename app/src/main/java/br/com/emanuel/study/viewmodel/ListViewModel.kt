package br.com.emanuel.study.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import br.com.emanuel.study.model.Animal

class ListViewModel(application: Application): AndroidViewModel(application) {

    val animals by lazy { MutableLiveData<List<Animal>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loading by lazy { MutableLiveData<Boolean>() }

    fun refresh() {
        getAnimals()
    }

    private fun getAnimals() {
        val a1 = Animal("Alligator")
        val a2 = Animal("Bee")
        val a3 = Animal("Cat")
        val a4 = Animal("Dog")
        val a5 = Animal("Elephant")
        val a6 = Animal("Duck")
        val a7 = Animal("Bird")
        val a8 = Animal("Hippo")

        val animalList = arrayListOf(a1, a2, a3, a4, a5, a6, a7, a8)

        animals.value = animalList
        loadError.value = false
        loading.value = false
    }
}