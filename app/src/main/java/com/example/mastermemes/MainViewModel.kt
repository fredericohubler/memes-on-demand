package com.example.mastermemes

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel: ViewModel(){

    var icons = MutableLiveData<List<AudioIcon>>()

    fun buildIcons() {

    }

}