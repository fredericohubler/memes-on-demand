package com.example.mastermemes

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel(private val repository: AudioIconRepository): ViewModel(){

    var icons = MutableLiveData<List<AudioIcon>>()

    init {
      buildIcons()
    }

    fun buildIcons() {
        icons.postValue(repository.fetchIcons())
    }

}